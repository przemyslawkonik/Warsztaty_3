package pl.coderslab.model;

public class Solution {
	private int id;
	private String created;
	private String updated;
	private String description;
	private int exerciseId;
	private long userId;

	public Solution() {
	}

	public Solution(String created, String updated, String description, int exerciseId, long userId) {
		this.created = created;
		this.updated = updated;
		this.description = description;
		this.exerciseId = exerciseId;
		this.userId = userId;
	}

	public Solution(int id, String created, String updated, String description, int exerciseId, long userId) {
		this.id = id;
		this.created = created;
		this.updated = updated;
		this.description = description;
		this.exerciseId = exerciseId;
		this.userId = userId;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(int exerciseId) {
		this.exerciseId = exerciseId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
