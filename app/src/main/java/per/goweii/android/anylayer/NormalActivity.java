package per.goweii.android.anylayer;

import android.animation.Animator;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

import per.goweii.anylayer.AnimHelper;
import per.goweii.anylayer.AnyLayer;

public class NormalActivity extends AppCompatActivity implements View.OnClickListener {

    private FrameLayout flContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        initView();
    }

    private void initView() {
        flContent = findViewById(R.id.fl_content);
        findViewById(R.id.tv_show_full).setOnClickListener(this);
        findViewById(R.id.tv_show_top).setOnClickListener(this);
        findViewById(R.id.tv_show_top_view_group).setOnClickListener(this);
        findViewById(R.id.tv_show_target_right).setOnClickListener(this);
        findViewById(R.id.tv_show_target_top).setOnClickListener(this);
        findViewById(R.id.tv_show_target_bottom).setOnClickListener(this);
        findViewById(R.id.tv_show_target_left).setOnClickListener(this);
        findViewById(R.id.tv_show_bottom).setOnClickListener(this);
        findViewById(R.id.tv_show_blur_bg).setOnClickListener(this);
        findViewById(R.id.tv_show_dark_bg).setOnClickListener(this);
        findViewById(R.id.tv_show_tran_bg).setOnClickListener(this);
        findViewById(R.id.tv_show_bottom_in).setOnClickListener(this);
        findViewById(R.id.tv_show_bottom_alpha_in).setOnClickListener(this);
        findViewById(R.id.tv_show_top_in).setOnClickListener(this);
        findViewById(R.id.tv_show_top_alpha_in).setOnClickListener(this);
        findViewById(R.id.tv_show_top_bottom).setOnClickListener(this);
        findViewById(R.id.tv_show_bottom_top).setOnClickListener(this);
        findViewById(R.id.tv_show_top_bottom_alpha).setOnClickListener(this);
        findViewById(R.id.tv_show_bottom_top_alpha).setOnClickListener(this);
        findViewById(R.id.tv_show_left_in).setOnClickListener(this);
        findViewById(R.id.tv_show_left_alpha_in).setOnClickListener(this);
        findViewById(R.id.tv_show_right_in).setOnClickListener(this);
        findViewById(R.id.tv_show_right_alpha_in).setOnClickListener(this);
        findViewById(R.id.tv_show_left_right).setOnClickListener(this);
        findViewById(R.id.tv_show_right_left).setOnClickListener(this);
        findViewById(R.id.tv_show_left_right_alpha).setOnClickListener(this);
        findViewById(R.id.tv_show_right_left_alpha).setOnClickListener(this);
        findViewById(R.id.tv_show_reveal).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.tv_show_full:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_1)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .onClickToDismiss(R.id.iv_1)
                        .show();
                break;
            case R.id.tv_show_top:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_3)
                        .asStatusBar(R.id.v_status_bar)
                        .backgroundColorRes(R.color.dialog_bg)
                        .gravity(Gravity.TOP)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createTopInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createTopOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_top_view_group:
                AnyLayer.with(flContent)
                        .contentView(R.layout.dialog_test_3)
                        .backgroundColorRes(R.color.dialog_bg)
                        .gravity(Gravity.TOP)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createTopInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createTopOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_target_right:
                AnyLayer.target(findViewById(R.id.tv_show_target_right))
                        .contentView(R.layout.dialog_test_5)
                        .alignment(AnyLayer.Alignment.Direction.HORIZONTAL, AnyLayer.Alignment.Horizontal.TO_RIGHT, AnyLayer.Alignment.Vertical.CENTER, true)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createLeftInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createLeftOutAnim(content);
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_target_left:
                AnyLayer.target(findViewById(R.id.tv_show_target_left))
                        .contentView(R.layout.dialog_test_5)
                        .alignment(AnyLayer.Alignment.Direction.HORIZONTAL, AnyLayer.Alignment.Horizontal.TO_LEFT, AnyLayer.Alignment.Vertical.CENTER, true)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createRightInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createRightOutAnim(content);
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_target_top:
                AnyLayer.target(findViewById(R.id.tv_show_target_top))
                        .contentView(R.layout.dialog_test_4)
                        .alignment(AnyLayer.Alignment.Direction.VERTICAL, AnyLayer.Alignment.Horizontal.CENTER, AnyLayer.Alignment.Vertical.ABOVE, true)
                        .backgroundColorRes(R.color.dialog_bg)
                        .gravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createBottomInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createBottomOutAnim(content);
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_target_bottom:
                AnyLayer.target(findViewById(R.id.tv_show_target_bottom))
                        .contentView(R.layout.dialog_test_4)
                        .alignment(AnyLayer.Alignment.Direction.VERTICAL, AnyLayer.Alignment.Horizontal.CENTER, AnyLayer.Alignment.Vertical.BELOW, true)
                        .backgroundColorRes(R.color.dialog_bg)
                        .gravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createTopInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createTopOutAnim(content);
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_bottom:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_3)
                        .backgroundColorRes(R.color.dialog_bg)
                        .gravity(Gravity.BOTTOM)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createBottomInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createBottomOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_blur_bg:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundBlurPercent(0.05f)
                        .backgroundColorInt(getResources().getColor(R.color.dialog_blur_bg))
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_dark_bg:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_tran_bg:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_bottom_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createBottomInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createBottomOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_bottom_alpha_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createBottomAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createBottomAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_top_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createTopInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createTopOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_top_alpha_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createTopAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createTopAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_top_bottom:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createTopInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createBottomOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_bottom_top:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createBottomInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createTopOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_top_bottom_alpha:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createTopAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createBottomAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_bottom_top_alpha:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createBottomAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createTopAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_left_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createLeftInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createLeftOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_left_alpha_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createLeftAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createLeftAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_right_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createRightInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createRightOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_right_alpha_in:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createRightAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createRightAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_left_right:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createLeftInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createRightOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_right_left:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createRightInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createLeftOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_left_right_alpha:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createLeftAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createRightAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_right_left_alpha:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                return AnimHelper.createRightAlphaInAnim(content);
                            }

                            @Override
                            public Animator outAnim(View content) {
                                return AnimHelper.createLeftAlphaOutAnim(content);
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.tv_show_reveal:
                AnyLayer.with(NormalActivity.this)
                        .contentView(R.layout.dialog_test_2)
                        .backgroundColorRes(R.color.dialog_bg)
                        .cancelableOnTouchOutside(true)
                        .cancelableOnClickKeyBack(true)
                        .contentAnim(new AnyLayer.IAnim() {
                            @Override
                            public Animator inAnim(View content) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                    return AnimHelper.createCircularRevealInAnim(content, content.getMeasuredWidth() / 2, content.getMeasuredHeight() / 2);
                                } else {
                                    return null;
                                }
                            }

                            @Override
                            public Animator outAnim(View content) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                    return AnimHelper.createCircularRevealOutAnim(content, content.getMeasuredWidth() / 2, content.getMeasuredHeight() / 2);
                                } else {
                                    return null;
                                }
                            }
                        })
                        .onClick(R.id.fl_dialog_no, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .onClick(R.id.fl_dialog_yes, new AnyLayer.OnLayerClickListener() {
                            @Override
                            public void onClick(AnyLayer anyLayer, View v) {
                                anyLayer.dismiss();
                            }
                        })
                        .show();
                break;
        }
    }
}

