package via.sdj3.proofofconcept_v3.jwtUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.entity.Patient;

import java.security.SecureRandom;
import java.util.Date;

@Service
public class JwtUtil {
    private final String SECRET_KEY; // Change this to a secure key
    private static final long EXPIRATION_TIME = 864_000_000; // 10 days


    public JwtUtil() {
        this.SECRET_KEY = generateSecretKey();
    }

    public String generateDoctorToken(Doctor doctor) {
        return Jwts.builder()
                .setSubject("doctor")
                .claim("username",doctor.getUserName())
                .claim("id",doctor.getId())
                .claim("fullName",doctor.getFullName())
                .claim("specelization",doctor.getSpecialization())
                .claim("validated",doctor.isValidated())
                .claim("http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name", doctor.getFullName())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public String generatePatientToken(Patient patient) {
        return null;
        /*
        return Jwts.builder()
                .setSubject("doctor")
                .claim("username",patient.getUserName())
                .claim("id",patient.getId())
                .claim("fullName",patient.getFullName())
                .claim("http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name", patient.getFullName())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();

         */
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
