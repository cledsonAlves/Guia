package br.liveo.fragments;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import br.liveo.adapter.ViewPagerAdapter;
import br.liveo.sliding.SamplePagerItem;
import br.liveo.sliding.SlidingTabLayout;
import br.liveo.utils.Utils;

import com.br.guiajarinu.R;

public class ViewPagerFragment extends Fragment{
	private List<SamplePagerItem> mTabs = new ArrayList<SamplePagerItem>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTabs.add(new SamplePagerItem(0, getString(R.string.tab_1), getResources().getColor(Utils.colors[0]),  Color.GRAY));
        mTabs.add(new SamplePagerItem(1, getString(R.string.tab_2), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(2, getString(R.string.tab_20), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(3, getString(R.string.tab_3), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(4, getString(R.string.tab_4), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(5, getString(R.string.tab_5), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(6, getString(R.string.tab_6), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(7, getString(R.string.tab_7), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(8, getString(R.string.tab_8), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(9, getString(R.string.tab_9), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(10, getString(R.string.tab_10), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(11, getString(R.string.tab_11), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(12, getString(R.string.tab_12), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(13, getString(R.string.tab_13), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(14, getString(R.string.tab_14), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(15, getString(R.string.tab_15), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(16, getString(R.string.tab_16), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(17, getString(R.string.tab_17), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(18, getString(R.string.tab_18), getResources().getColor(Utils.colors[2]), Color.GRAY));
        mTabs.add(new SamplePagerItem(19, getString(R.string.tab_19), getResources().getColor(Utils.colors[2]), Color.GRAY));
       
      

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.viewpager_fragment, container, false);
    }

    @SuppressLint("ResourceAsColor")
	@Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    	ViewPager mViewPager = (ViewPager) view.findViewById(R.id.mPager);
    	
    	mViewPager.setOffscreenPageLimit(3); 
        mViewPager.setAdapter(new ViewPagerAdapter(getChildFragmentManager(), mTabs));

        SlidingTabLayout mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.mTabs);
        mSlidingTabLayout.setBackgroundResource(R.color.white);
        mSlidingTabLayout.setViewPager(mViewPager);

        mSlidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {

            @Override
            public int getIndicatorColor(int position) {
                return mTabs.get(position).getIndicatorColor();
            }

            @Override
            public int getDividerColor(int position) {
                return mTabs.get(position).getDividerColor();
            }
        });
    }
}