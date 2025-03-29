package com.root.moduleapplication;

import com.root.moduleapplication.reservation.repository.ReservationRepository;
import com.root.moduleapplication.reservation.service.ReservationServiceImpl;
import com.root.moduledomain.reservation.dto.ReservationRequestDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutorService;

@SpringBootTest
class ModuleApplicationTests {

	@Autowired
	ReservationServiceImpl reservationService;

	@Autowired
	ReservationRepository reservationRepository;

	@Test
	@DisplayName("(멀티 스레드 테스트")
	void createReservation() {
		for(int i=0; i<100; i++){
			reservationService.create(new ReservationRequestDto(1L,1L,1L,1L));
			}
	}
}
