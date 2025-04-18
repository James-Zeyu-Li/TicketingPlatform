package org.java.ticketingplatform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venue {
	private String venueID;
	private String venueName;
	private List<Zone> zones;
}
