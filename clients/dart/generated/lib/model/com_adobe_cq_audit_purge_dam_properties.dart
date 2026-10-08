//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqAuditPurgeDamProperties {
  /// Returns a new [ComAdobeCqAuditPurgeDamProperties] instance.
  ComAdobeCqAuditPurgeDamProperties({
    this.auditlogPeriodRulePeriodName,
    this.auditlogPeriodRulePeriodContentpath,
    this.auditlogPeriodRulePeriodMinimumage,
    this.auditlogPeriodRulePeriodTypes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? auditlogPeriodRulePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? auditlogPeriodRulePeriodContentpath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? auditlogPeriodRulePeriodMinimumage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? auditlogPeriodRulePeriodTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqAuditPurgeDamProperties &&
    other.auditlogPeriodRulePeriodName == auditlogPeriodRulePeriodName &&
    other.auditlogPeriodRulePeriodContentpath == auditlogPeriodRulePeriodContentpath &&
    other.auditlogPeriodRulePeriodMinimumage == auditlogPeriodRulePeriodMinimumage &&
    other.auditlogPeriodRulePeriodTypes == auditlogPeriodRulePeriodTypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (auditlogPeriodRulePeriodName == null ? 0 : auditlogPeriodRulePeriodName!.hashCode) +
    (auditlogPeriodRulePeriodContentpath == null ? 0 : auditlogPeriodRulePeriodContentpath!.hashCode) +
    (auditlogPeriodRulePeriodMinimumage == null ? 0 : auditlogPeriodRulePeriodMinimumage!.hashCode) +
    (auditlogPeriodRulePeriodTypes == null ? 0 : auditlogPeriodRulePeriodTypes!.hashCode);

  @override
  String toString() => 'ComAdobeCqAuditPurgeDamProperties[auditlogPeriodRulePeriodName=$auditlogPeriodRulePeriodName, auditlogPeriodRulePeriodContentpath=$auditlogPeriodRulePeriodContentpath, auditlogPeriodRulePeriodMinimumage=$auditlogPeriodRulePeriodMinimumage, auditlogPeriodRulePeriodTypes=$auditlogPeriodRulePeriodTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.auditlogPeriodRulePeriodName != null) {
      json[r'auditlog.rule.name'] = this.auditlogPeriodRulePeriodName;
    } else {
      json[r'auditlog.rule.name'] = null;
    }
    if (this.auditlogPeriodRulePeriodContentpath != null) {
      json[r'auditlog.rule.contentpath'] = this.auditlogPeriodRulePeriodContentpath;
    } else {
      json[r'auditlog.rule.contentpath'] = null;
    }
    if (this.auditlogPeriodRulePeriodMinimumage != null) {
      json[r'auditlog.rule.minimumage'] = this.auditlogPeriodRulePeriodMinimumage;
    } else {
      json[r'auditlog.rule.minimumage'] = null;
    }
    if (this.auditlogPeriodRulePeriodTypes != null) {
      json[r'auditlog.rule.types'] = this.auditlogPeriodRulePeriodTypes;
    } else {
      json[r'auditlog.rule.types'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqAuditPurgeDamProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqAuditPurgeDamProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqAuditPurgeDamProperties(
        auditlogPeriodRulePeriodName: ConfigNodePropertyString.fromJson(json[r'auditlog.rule.name']),
        auditlogPeriodRulePeriodContentpath: ConfigNodePropertyString.fromJson(json[r'auditlog.rule.contentpath']),
        auditlogPeriodRulePeriodMinimumage: ConfigNodePropertyInteger.fromJson(json[r'auditlog.rule.minimumage']),
        auditlogPeriodRulePeriodTypes: ConfigNodePropertyDropDown.fromJson(json[r'auditlog.rule.types']),
      );
    }
    return null;
  }

  static List<ComAdobeCqAuditPurgeDamProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqAuditPurgeDamProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqAuditPurgeDamProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqAuditPurgeDamProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqAuditPurgeDamProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqAuditPurgeDamProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqAuditPurgeDamProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqAuditPurgeDamProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqAuditPurgeDamProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqAuditPurgeDamProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

