package com.azoft.carousellayoutmanager;

public class ItemTransformation {
	float mScaleX;
	float mScaleY;
	float mTranslationX;
	float mTranslationY;

	public ItemTransformation() {
	}

	public ItemTransformation(final float scaleX, final float scaleY, final float translationX, final float translationY) {
		mScaleX = scaleX;
		mScaleY = scaleY;
		mTranslationX = translationX;
		mTranslationY = translationY;
	}

	public float getScaleX() {
		return mScaleX;
	}

	public void setScaleX(float scaleX) {
		this.mScaleX = scaleX;
	}

	public float getScaleY() {
		return mScaleY;
	}

	public void setScaleY(float scaleY) {
		this.mScaleY = scaleY;
	}

	public float getTranslationX() {
		return mTranslationX;
	}

	public void setTranslationX(float mTranslationX) {
		this.mTranslationX = mTranslationX;
	}

	public float getTranslationY() {
		return mTranslationY;
	}

	public void setTranslationY(float mTranslationY) {
		this.mTranslationY = mTranslationY;
	}
}