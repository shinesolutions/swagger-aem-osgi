//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties {
  /// Returns a new [ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties] instance.
  ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties({
    this.cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties &&
    other.cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled == cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled == null ? 0 : cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties[cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled=$cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled != null) {
      json[r'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled'] = this.cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled;
    } else {
      json[r'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(
        cqPeriodAnalyticsPeriodTestandtargetPeriodPushauthorcampaignpagelistenerPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

