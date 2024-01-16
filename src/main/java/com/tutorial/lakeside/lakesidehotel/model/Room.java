package com.tutorial.lakeside.lakesidehotel.model;

import java.math.BigDecimal;
import java.util.List;

class Room  {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked;
    private List<BookedRoom> bookings;
  
}