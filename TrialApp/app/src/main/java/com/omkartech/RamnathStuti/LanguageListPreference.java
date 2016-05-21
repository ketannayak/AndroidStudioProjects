package com.omkartech.RamnathStuti;

import android.content.Context;
import android.content.res.Resources;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.List;

/**
 * Created by ketannayak on 5/20/16.
 */
public class LanguageListPreference extends ListPreference {



    public LanguageListPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LanguageListPreference(Context context) {
        super(context);
    }

    @Override
    protected View onCreateDialogView() {
        ListView view = new ListView(getContext());
        view.setAdapter(adapter());
        setEntries(entries());
        setEntryValues(entryValues());
        return view;
    }

    private ListAdapter adapter() {
        return new ArrayAdapter(getContext(), android.R.layout.select_dialog_singlechoice);
    }

    private CharSequence[] entries() {
        //action to provide entry data in char sequence array for list
        Resources res = Resources.getSystem();
        //CharSequence langentries[] = res.getStringArray(R.array.pref_language_list_names);
        CharSequence langentries[] = {"English","Marathi","ಕನ್ನಡ"};
        return langentries;
    }

    private CharSequence[] entryValues() {
        //action to provide value data for list
        Resources res = Resources.getSystem();
        //CharSequence langentryvalues[] = res.getStringArray(R.array.pref_language_list_values);

        CharSequence langentryvalues[] = {"en","mr","kn"};
        return langentryvalues;
    }


}
