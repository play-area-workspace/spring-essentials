package com.sashmitha.springroomwebapp.data.repository;

import com.sashmitha.springroomwebapp.data.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoomRepository extends JpaRepository<RoomEntity, UUID> {


}
