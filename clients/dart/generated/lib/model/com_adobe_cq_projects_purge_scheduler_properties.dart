//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqProjectsPurgeSchedulerProperties {
  /// Returns a new [ComAdobeCqProjectsPurgeSchedulerProperties] instance.
  ComAdobeCqProjectsPurgeSchedulerProperties({
    this.scheduledpurgePeriodName,
    this.scheduledpurgePeriodPurgeActive,
    this.scheduledpurgePeriodTemplates,
    this.scheduledpurgePeriodPurgeGroups,
    this.scheduledpurgePeriodPurgeAssets,
    this.scheduledpurgePeriodTerminateRunningWorkflows,
    this.scheduledpurgePeriodDaysold,
    this.scheduledpurgePeriodSaveThreshold,
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
  ConfigNodePropertyBoolean? scheduledpurgePeriodPurgeActive;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? scheduledpurgePeriodTemplates;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? scheduledpurgePeriodPurgeGroups;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? scheduledpurgePeriodPurgeAssets;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? scheduledpurgePeriodTerminateRunningWorkflows;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? scheduledpurgePeriodDaysold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? scheduledpurgePeriodSaveThreshold;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqProjectsPurgeSchedulerProperties &&
    other.scheduledpurgePeriodName == scheduledpurgePeriodName &&
    other.scheduledpurgePeriodPurgeActive == scheduledpurgePeriodPurgeActive &&
    other.scheduledpurgePeriodTemplates == scheduledpurgePeriodTemplates &&
    other.scheduledpurgePeriodPurgeGroups == scheduledpurgePeriodPurgeGroups &&
    other.scheduledpurgePeriodPurgeAssets == scheduledpurgePeriodPurgeAssets &&
    other.scheduledpurgePeriodTerminateRunningWorkflows == scheduledpurgePeriodTerminateRunningWorkflows &&
    other.scheduledpurgePeriodDaysold == scheduledpurgePeriodDaysold &&
    other.scheduledpurgePeriodSaveThreshold == scheduledpurgePeriodSaveThreshold;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (scheduledpurgePeriodName == null ? 0 : scheduledpurgePeriodName!.hashCode) +
    (scheduledpurgePeriodPurgeActive == null ? 0 : scheduledpurgePeriodPurgeActive!.hashCode) +
    (scheduledpurgePeriodTemplates == null ? 0 : scheduledpurgePeriodTemplates!.hashCode) +
    (scheduledpurgePeriodPurgeGroups == null ? 0 : scheduledpurgePeriodPurgeGroups!.hashCode) +
    (scheduledpurgePeriodPurgeAssets == null ? 0 : scheduledpurgePeriodPurgeAssets!.hashCode) +
    (scheduledpurgePeriodTerminateRunningWorkflows == null ? 0 : scheduledpurgePeriodTerminateRunningWorkflows!.hashCode) +
    (scheduledpurgePeriodDaysold == null ? 0 : scheduledpurgePeriodDaysold!.hashCode) +
    (scheduledpurgePeriodSaveThreshold == null ? 0 : scheduledpurgePeriodSaveThreshold!.hashCode);

  @override
  String toString() => 'ComAdobeCqProjectsPurgeSchedulerProperties[scheduledpurgePeriodName=$scheduledpurgePeriodName, scheduledpurgePeriodPurgeActive=$scheduledpurgePeriodPurgeActive, scheduledpurgePeriodTemplates=$scheduledpurgePeriodTemplates, scheduledpurgePeriodPurgeGroups=$scheduledpurgePeriodPurgeGroups, scheduledpurgePeriodPurgeAssets=$scheduledpurgePeriodPurgeAssets, scheduledpurgePeriodTerminateRunningWorkflows=$scheduledpurgePeriodTerminateRunningWorkflows, scheduledpurgePeriodDaysold=$scheduledpurgePeriodDaysold, scheduledpurgePeriodSaveThreshold=$scheduledpurgePeriodSaveThreshold]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.scheduledpurgePeriodName != null) {
      json[r'scheduledpurge.name'] = this.scheduledpurgePeriodName;
    } else {
      json[r'scheduledpurge.name'] = null;
    }
    if (this.scheduledpurgePeriodPurgeActive != null) {
      json[r'scheduledpurge.purgeActive'] = this.scheduledpurgePeriodPurgeActive;
    } else {
      json[r'scheduledpurge.purgeActive'] = null;
    }
    if (this.scheduledpurgePeriodTemplates != null) {
      json[r'scheduledpurge.templates'] = this.scheduledpurgePeriodTemplates;
    } else {
      json[r'scheduledpurge.templates'] = null;
    }
    if (this.scheduledpurgePeriodPurgeGroups != null) {
      json[r'scheduledpurge.purgeGroups'] = this.scheduledpurgePeriodPurgeGroups;
    } else {
      json[r'scheduledpurge.purgeGroups'] = null;
    }
    if (this.scheduledpurgePeriodPurgeAssets != null) {
      json[r'scheduledpurge.purgeAssets'] = this.scheduledpurgePeriodPurgeAssets;
    } else {
      json[r'scheduledpurge.purgeAssets'] = null;
    }
    if (this.scheduledpurgePeriodTerminateRunningWorkflows != null) {
      json[r'scheduledpurge.terminateRunningWorkflows'] = this.scheduledpurgePeriodTerminateRunningWorkflows;
    } else {
      json[r'scheduledpurge.terminateRunningWorkflows'] = null;
    }
    if (this.scheduledpurgePeriodDaysold != null) {
      json[r'scheduledpurge.daysold'] = this.scheduledpurgePeriodDaysold;
    } else {
      json[r'scheduledpurge.daysold'] = null;
    }
    if (this.scheduledpurgePeriodSaveThreshold != null) {
      json[r'scheduledpurge.saveThreshold'] = this.scheduledpurgePeriodSaveThreshold;
    } else {
      json[r'scheduledpurge.saveThreshold'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqProjectsPurgeSchedulerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqProjectsPurgeSchedulerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqProjectsPurgeSchedulerProperties(
        scheduledpurgePeriodName: ConfigNodePropertyString.fromJson(json[r'scheduledpurge.name']),
        scheduledpurgePeriodPurgeActive: ConfigNodePropertyBoolean.fromJson(json[r'scheduledpurge.purgeActive']),
        scheduledpurgePeriodTemplates: ConfigNodePropertyArray.fromJson(json[r'scheduledpurge.templates']),
        scheduledpurgePeriodPurgeGroups: ConfigNodePropertyBoolean.fromJson(json[r'scheduledpurge.purgeGroups']),
        scheduledpurgePeriodPurgeAssets: ConfigNodePropertyBoolean.fromJson(json[r'scheduledpurge.purgeAssets']),
        scheduledpurgePeriodTerminateRunningWorkflows: ConfigNodePropertyBoolean.fromJson(json[r'scheduledpurge.terminateRunningWorkflows']),
        scheduledpurgePeriodDaysold: ConfigNodePropertyInteger.fromJson(json[r'scheduledpurge.daysold']),
        scheduledpurgePeriodSaveThreshold: ConfigNodePropertyInteger.fromJson(json[r'scheduledpurge.saveThreshold']),
      );
    }
    return null;
  }

  static List<ComAdobeCqProjectsPurgeSchedulerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqProjectsPurgeSchedulerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqProjectsPurgeSchedulerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqProjectsPurgeSchedulerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqProjectsPurgeSchedulerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqProjectsPurgeSchedulerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqProjectsPurgeSchedulerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqProjectsPurgeSchedulerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqProjectsPurgeSchedulerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqProjectsPurgeSchedulerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

