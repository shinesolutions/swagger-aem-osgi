//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {
  /// Returns a new [ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties] instance.
  ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties({
    this.deletePeriodPathPeriodRegexps,
    this.deletePeriodSql2PeriodQuery,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? deletePeriodPathPeriodRegexps;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? deletePeriodSql2PeriodQuery;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties &&
    other.deletePeriodPathPeriodRegexps == deletePeriodPathPeriodRegexps &&
    other.deletePeriodSql2PeriodQuery == deletePeriodSql2PeriodQuery;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deletePeriodPathPeriodRegexps == null ? 0 : deletePeriodPathPeriodRegexps!.hashCode) +
    (deletePeriodSql2PeriodQuery == null ? 0 : deletePeriodSql2PeriodQuery!.hashCode);

  @override
  String toString() => 'ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties[deletePeriodPathPeriodRegexps=$deletePeriodPathPeriodRegexps, deletePeriodSql2PeriodQuery=$deletePeriodSql2PeriodQuery]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.deletePeriodPathPeriodRegexps != null) {
      json[r'delete.path.regexps'] = this.deletePeriodPathPeriodRegexps;
    } else {
      json[r'delete.path.regexps'] = null;
    }
    if (this.deletePeriodSql2PeriodQuery != null) {
      json[r'delete.sql2.query'] = this.deletePeriodSql2PeriodQuery;
    } else {
      json[r'delete.sql2.query'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(
        deletePeriodPathPeriodRegexps: ConfigNodePropertyArray.fromJson(json[r'delete.path.regexps']),
        deletePeriodSql2PeriodQuery: ConfigNodePropertyString.fromJson(json[r'delete.sql2.query']),
      );
    }
    return null;
  }

  static List<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

