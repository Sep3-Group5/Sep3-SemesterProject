package via.sdj3.proofofconcept_v3.jwtUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Date;

@Service
public class JwtUtil {
    private final String SECRET_KEY; // Change this to a secure key
    private static final long EXPIRATION_TIME = 864_000_000; // 10 days


    public JwtUtil() {
        this.SECRET_KEY = generateSecretKey();
    }

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .claim("username",username)
                .claim("http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name", username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public  String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    public  Claims extractClaims(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }


    public  String generateSecretKey() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] keyBytes = new byte[64]; // Adjust the size based on your security requirements
        secureRandom.nextBytes(keyBytes);
        return bytesToHex(keyBytes);
    }

    private  String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}
