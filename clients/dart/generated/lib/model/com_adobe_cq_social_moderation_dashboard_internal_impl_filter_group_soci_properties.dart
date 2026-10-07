//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties {
  /// Returns a new [ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties] instance.
  ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties({
    this.resourceTypePeriodFilters,
    this.priority,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? resourceTypePeriodFilters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? priority;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties &&
    other.resourceTypePeriodFilters == resourceTypePeriodFilters &&
    other.priority == priority;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (resourceTypePeriodFilters == null ? 0 : resourceTypePeriodFilters!.hashCode) +
    (priority == null ? 0 : priority!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties[resourceTypePeriodFilters=$resourceTypePeriodFilters, priority=$priority]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.resourceTypePeriodFilters != null) {
      json[r'resourceType.filters'] = this.resourceTypePeriodFilters;
    } else {
      json[r'resourceType.filters'] = null;
    }
    if (this.priority != null) {
      json[r'priority'] = this.priority;
    } else {
      json[r'priority'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(
        resourceTypePeriodFilters: ConfigNodePropertyArray.fromJson(json[r'resourceType.filters']),
        priority: ConfigNodePropertyInteger.fromJson(json[r'priority']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

