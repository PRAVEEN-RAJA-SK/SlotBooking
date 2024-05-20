package com.praveen.codes.SlotBooking.repository;

import com.praveen.codes.SlotBooking.model.MasterSlot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterSlotRepository extends JpaRepository<MasterSlot,Integer> {
    List<MasterSlot> findByAvailable(boolean b);

    List<MasterSlot> findByCourseIdAndAvailable(String courseId, boolean b);
}
