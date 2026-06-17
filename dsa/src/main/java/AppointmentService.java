/*
public class AppointmentService {

    public void bookAppointment(String doctorId, String patientId, String slot) {

        DatabaseConnection conn = DatabaseConnection.open();

        try {
            boolean isAvailable = conn.checkSlotAvailability(doctorId, slot);
            if (!isAvailable) {
                throw new SlotNotAvailableException(
                        "Slot " + slot + " is not available for doctor: " + doctorId);
            }
            conn.saveAppointment(doctorId, patientId, slot);

            System.out.println("Appointment booked successfully");

            //

        } catch (SlotNotAvailableException e) {
            System.out.println("Could not book: " + e.getMessage());
        }
    }
}
*/
