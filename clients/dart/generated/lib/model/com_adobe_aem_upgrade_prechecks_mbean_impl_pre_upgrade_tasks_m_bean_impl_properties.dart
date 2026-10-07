//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
  /// Returns a new [ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties] instance.
  ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties({
    this.preUpgradePeriodMaintenancePeriodTasks,
    this.preUpgradePeriodHcPeriodTags,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? preUpgradePeriodMaintenancePeriodTasks;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? preUpgradePeriodHcPeriodTags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties &&
    other.preUpgradePeriodMaintenancePeriodTasks == preUpgradePeriodMaintenancePeriodTasks &&
    other.preUpgradePeriodHcPeriodTags == preUpgradePeriodHcPeriodTags;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (preUpgradePeriodMaintenancePeriodTasks == null ? 0 : preUpgradePeriodMaintenancePeriodTasks!.hashCode) +
    (preUpgradePeriodHcPeriodTags == null ? 0 : preUpgradePeriodHcPeriodTags!.hashCode);

  @override
  String toString() => 'ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties[preUpgradePeriodMaintenancePeriodTasks=$preUpgradePeriodMaintenancePeriodTasks, preUpgradePeriodHcPeriodTags=$preUpgradePeriodHcPeriodTags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.preUpgradePeriodMaintenancePeriodTasks != null) {
      json[r'pre-upgrade.maintenance.tasks'] = this.preUpgradePeriodMaintenancePeriodTasks;
    } else {
      json[r'pre-upgrade.maintenance.tasks'] = null;
    }
    if (this.preUpgradePeriodHcPeriodTags != null) {
      json[r'pre-upgrade.hc.tags'] = this.preUpgradePeriodHcPeriodTags;
    } else {
      json[r'pre-upgrade.hc.tags'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(
        preUpgradePeriodMaintenancePeriodTasks: ConfigNodePropertyArray.fromJson(json[r'pre-upgrade.maintenance.tasks']),
        preUpgradePeriodHcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'pre-upgrade.hc.tags']),
      );
    }
    return null;
  }

  static List<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

