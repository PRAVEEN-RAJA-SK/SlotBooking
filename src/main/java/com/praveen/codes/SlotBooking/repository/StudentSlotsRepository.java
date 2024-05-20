package com.praveen.codes.SlotBooking.repository;
import com.praveen.codes.SlotBooking.model.StudentSlots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSlotsRepository extends JpaRepository<StudentSlots, Integer> {
}
