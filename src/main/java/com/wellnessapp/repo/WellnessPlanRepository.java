package com.wellnessapp.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellnessapp.entity.WellnessPlan;

@Repository
public interface WellnessPlanRepository extends JpaRepository<WellnessPlan, Long> {
	List<WellnessPlan> findByUserId(Long userId);

	List<WellnessPlan> findByUserIdAndPlanType(Long userId, String planType);

	List<WellnessPlan> findByDescriptionContainingOrGoalsContaining(String descriptionKeyword, String goalsKeyword);

	List<WellnessPlan> findByStartDateGreaterThanEqual(LocalDate startDate);
}
