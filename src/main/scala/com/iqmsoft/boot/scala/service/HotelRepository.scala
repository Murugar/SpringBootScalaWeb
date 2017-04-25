package com.iqmsoft.boot.scala.service

import org.springframework.data.repository.CrudRepository
import com.iqmsoft.boot.scala.domain.Hotel
import java.lang.Long

trait HotelRepository extends CrudRepository[Hotel, Long]