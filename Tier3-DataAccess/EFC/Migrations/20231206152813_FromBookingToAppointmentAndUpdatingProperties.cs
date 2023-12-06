using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace EFC.Migrations
{
    /// <inheritdoc />
    public partial class FromBookingToAppointmentAndUpdatingProperties : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_Bookings",
                table: "Bookings");

            migrationBuilder.RenameTable(
                name: "Bookings",
                newName: "Appointments");

            migrationBuilder.RenameColumn(
                name: "Name",
                table: "Patients",
                newName: "Username");

            migrationBuilder.RenameColumn(
                name: "FullName",
                table: "Doctors",
                newName: "Fullname");

            migrationBuilder.AddColumn<string>(
                name: "Fullname",
                table: "Patients",
                type: "TEXT",
                nullable: false,
                defaultValue: "");

            migrationBuilder.AddColumn<string>(
                name: "Password",
                table: "Patients",
                type: "TEXT",
                nullable: false,
                defaultValue: "");

            migrationBuilder.AddColumn<bool>(
                name: "Status",
                table: "Appointments",
                type: "INTEGER",
                nullable: false,
                defaultValue: false);

            migrationBuilder.AddPrimaryKey(
                name: "PK_Appointments",
                table: "Appointments",
                column: "Id");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_Appointments",
                table: "Appointments");

            migrationBuilder.DropColumn(
                name: "Fullname",
                table: "Patients");

            migrationBuilder.DropColumn(
                name: "Password",
                table: "Patients");

            migrationBuilder.DropColumn(
                name: "Status",
                table: "Appointments");

            migrationBuilder.RenameTable(
                name: "Appointments",
                newName: "Bookings");

            migrationBuilder.RenameColumn(
                name: "Username",
                table: "Patients",
                newName: "Name");

            migrationBuilder.RenameColumn(
                name: "Fullname",
                table: "Doctors",
                newName: "FullName");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Bookings",
                table: "Bookings",
                column: "Id");
        }
    }
}
