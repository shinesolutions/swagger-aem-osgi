//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteWorkflowPurgeSchedulerProperties {
  /// Returns a new [ComAdobeGraniteWorkflowPurgeSchedulerProperties] instance.
  ComAdobeGraniteWorkflowPurgeSchedulerProperties({
    this.scheduledpurgePeriodName,
    this.scheduledpurgePeriodWorkflowStatus,
    this.scheduledpurgePeriodModelIds,
    this.scheduledpurgePeriodDaysold,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scheduledpurgePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? scheduledpurgePeriodWorkflowStatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? scheduledpurgePeriodModelIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? scheduledpurgePeriodDaysold;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteWorkflowPurgeSchedulerProperties &&
    other.scheduledpurgePeriodName == scheduledpurgePeriodName &&
    other.scheduledpurgePeriodWorkflowStatus == scheduledpurgePeriodWorkflowStatus &&
    other.scheduledpurgePeriodModelIds == scheduledpurgePeriodModelIds &&
    other.scheduledpurgePeriodDaysold == scheduledpurgePeriodDaysold;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (scheduledpurgePeriodName == null ? 0 : scheduledpurgePeriodName!.hashCode) +
    (scheduledpurgePeriodWorkflowStatus == null ? 0 : scheduledpurgePeriodWorkflowStatus!.hashCode) +
    (scheduledpurgePeriodModelIds == null ? 0 : scheduledpurgePeriodModelIds!.hashCode) +
    (scheduledpurgePeriodDaysold == null ? 0 : scheduledpurgePeriodDaysold!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteWorkflowPurgeSchedulerProperties[scheduledpurgePeriodName=$scheduledpurgePeriodName, scheduledpurgePeriodWorkflowStatus=$scheduledpurgePeriodWorkflowStatus, scheduledpurgePeriodModelIds=$scheduledpurgePeriodModelIds, scheduledpurgePeriodDaysold=$scheduledpurgePeriodDaysold]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.scheduledpurgePeriodName != null) {
      json[r'scheduledpurge.name'] = this.scheduledpurgePeriodName;
    } else {
      json[r'scheduledpurge.name'] = null;
    }
    if (this.scheduledpurgePeriodWorkflowStatus != null) {
      json[r'scheduledpurge.workflowStatus'] = this.scheduledpurgePeriodWorkflowStatus;
    } else {
      json[r'scheduledpurge.workflowStatus'] = null;
    }
    if (this.scheduledpurgePeriodModelIds != null) {
      json[r'scheduledpurge.modelIds'] = this.scheduledpurgePeriodModelIds;
    } else {
      json[r'scheduledpurge.modelIds'] = null;
    }
    if (this.scheduledpurgePeriodDaysold != null) {
      json[r'scheduledpurge.daysold'] = this.scheduledpurgePeriodDaysold;
    } else {
      json[r'scheduledpurge.daysold'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteWorkflowPurgeSchedulerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteWorkflowPurgeSchedulerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteWorkflowPurgeSchedulerProperties(
        scheduledpurgePeriodName: ConfigNodePropertyString.fromJson(json[r'scheduledpurge.name']),
        scheduledpurgePeriodWorkflowStatus: ConfigNodePropertyDropDown.fromJson(json[r'scheduledpurge.workflowStatus']),
        scheduledpurgePeriodModelIds: ConfigNodePropertyArray.fromJson(json[r'scheduledpurge.modelIds']),
        scheduledpurgePeriodDaysold: ConfigNodePropertyInteger.fromJson(json[r'scheduledpurge.daysold']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteWorkflowPurgeSchedulerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteWorkflowPurgeSchedulerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteWorkflowPurgeSchedulerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteWorkflowPurgeSchedulerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteWorkflowPurgeSchedulerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteWorkflowPurgeSchedulerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteWorkflowPurgeSchedulerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteWorkflowPurgeSchedulerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteWorkflowPurgeSchedulerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteWorkflowPurgeSchedulerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

