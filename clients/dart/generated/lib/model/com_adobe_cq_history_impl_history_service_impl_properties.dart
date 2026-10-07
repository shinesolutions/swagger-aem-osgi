//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqHistoryImplHistoryServiceImplProperties {
  /// Returns a new [ComAdobeCqHistoryImplHistoryServiceImplProperties] instance.
  ComAdobeCqHistoryImplHistoryServiceImplProperties({
    this.historyPeriodServicePeriodResourceTypes,
    this.historyPeriodServicePeriodPathFilter,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? historyPeriodServicePeriodResourceTypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? historyPeriodServicePeriodPathFilter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqHistoryImplHistoryServiceImplProperties &&
    other.historyPeriodServicePeriodResourceTypes == historyPeriodServicePeriodResourceTypes &&
    other.historyPeriodServicePeriodPathFilter == historyPeriodServicePeriodPathFilter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (historyPeriodServicePeriodResourceTypes == null ? 0 : historyPeriodServicePeriodResourceTypes!.hashCode) +
    (historyPeriodServicePeriodPathFilter == null ? 0 : historyPeriodServicePeriodPathFilter!.hashCode);

  @override
  String toString() => 'ComAdobeCqHistoryImplHistoryServiceImplProperties[historyPeriodServicePeriodResourceTypes=$historyPeriodServicePeriodResourceTypes, historyPeriodServicePeriodPathFilter=$historyPeriodServicePeriodPathFilter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.historyPeriodServicePeriodResourceTypes != null) {
      json[r'history.service.resourceTypes'] = this.historyPeriodServicePeriodResourceTypes;
    } else {
      json[r'history.service.resourceTypes'] = null;
    }
    if (this.historyPeriodServicePeriodPathFilter != null) {
      json[r'history.service.pathFilter'] = this.historyPeriodServicePeriodPathFilter;
    } else {
      json[r'history.service.pathFilter'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqHistoryImplHistoryServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqHistoryImplHistoryServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqHistoryImplHistoryServiceImplProperties(
        historyPeriodServicePeriodResourceTypes: ConfigNodePropertyArray.fromJson(json[r'history.service.resourceTypes']),
        historyPeriodServicePeriodPathFilter: ConfigNodePropertyArray.fromJson(json[r'history.service.pathFilter']),
      );
    }
    return null;
  }

  static List<ComAdobeCqHistoryImplHistoryServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqHistoryImplHistoryServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqHistoryImplHistoryServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqHistoryImplHistoryServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqHistoryImplHistoryServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqHistoryImplHistoryServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqHistoryImplHistoryServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqHistoryImplHistoryServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqHistoryImplHistoryServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqHistoryImplHistoryServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

