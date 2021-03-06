[![](https://jitpack.io/v/lany192/TabLayout.svg)](https://jitpack.io/#lany192/TabLayout)

# TabLayout

# Use

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
   
	dependencies {
	        implementation 'com.github.lany192:TabLayout:latest'
	}
	
# Sample

    https://github.com/lany192/TabLayout/tree/master/sample/src/main/java/com/flyco/tablayoutsamples/ui
    
    <com.flyco.tablayout.PagerTabLayout
        android:id="@+id/tl_7"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:color/white"
        android:paddingTop="8dp"
        android:paddingBottom="8dp"
        app:tl_indicatorCornerRadius="3dp"
        app:tl_indicatorColor="#FFF4B4"
        app:tl_indicatorHeight="6dp"
        app:tl_indicatorMarginBottom="10dp"
        app:tl_indicatorWidthEqualTitle="true"
        app:tl_selectedTextColor="#06142E"
        app:tl_selectedTextSize="22sp"
        app:tl_unselectedTextColor="#666666"
        app:tl_unselectedTextSize="18sp" />

## Attributes

|name|format|description|
|:---:|:---:|:---:|
| tl_indicatorColor | color |set indicator color
| tl_indicatorHeight | dimension |set indicator height
| tl_indicatorWidth | dimension |set indicator width
| tl_indicatorMarginLeft | dimension |set indicator margin,invalid when indicator width is greater than 0.
| tl_indicatorMarginTop | dimension |set indicator margin,invalid when indicator width is greater than 0.
| tl_indicatorMarginRight | dimension |set indicator margin,invalid when indicator width is greater than 0.
| tl_indicatorMarginBottom | dimension |set indicator margin,invalid when indicator width is greater than 0.
| tl_indicatorCornerRadius | dimension |set indicator corner radius
| tl_indicatorGravity | enum |set indicator gravity TOP or BOTTOM.
| tl_indicatorStyle | enum |set indicator style NORMAL or TRIANGLE or BLOCK
| tl_underlineColor | color |set underline color
| tl_underlineHeight | dimension |set underline height
| tl_underlineGravity | enum |set underline gravity TOP or BOTTOM
| tl_dividerColor | color |set divider color
| tl_dividerWidth | dimension |set divider width
| tl_dividerPadding |dimension| set divider paddingTop and paddingBottom
| tl_tabPadding |dimension| set tab paddingLeft and paddingRight
| tl_tabSpaceEqual |boolean| set tab space equal
| tl_tabWidth |dimension| set tab width
| tl_textSize |dimension| set text size
| tl_selectedTextColor |color| set text select color
| tl_unselectedTextColor |color|  set text unselect color
| tl_textBold |boolean| set text is bold 
| tl_iconWidth |dimension| set icon width(only for CommonTabLayout)
| tl_iconHeight |dimension|set icon height(only for CommonTabLayout)
| tl_iconVisible |boolean| set icon is visible(only for CommonTabLayout)
| tl_iconGravity |enum| set icon gravity LEFT or TOP or RIGHT or BOTTOM(only for CommonTabLayout)
| tl_iconMargin |dimension| set icon margin with text(only for CommonTabLayout)
| tl_indicatorAnimEnable |boolean| set indicator support animation(only for CommonTabLayout)
| tl_indicatorAnimDuration |integer| set indicator animation duration(only for CommonTabLayout)
| tl_indicatorBounceEnable |boolean| set indicator aniamtion with bounce effect(only for CommonTabLayout)
| tl_indicatorWidthEqualTitle |boolean| set indicator width same as text(only for SlidingTabLayout)

## Dependence
*   [NineOldAndroids](https://github.com/JakeWharton/NineOldAndroids)
*   [FlycoRoundView](https://github.com/H07000223/FlycoRoundView)

## Thanks
*   [FlycoTabLayout](https://github.com/H07000223/FlycoTabLayout)
*   [PagerSlidingTabStrip](https://github.com/jpardogo/PagerSlidingTabStrip)
