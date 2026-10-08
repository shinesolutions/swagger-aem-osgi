//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqAuditPurgePagesProperties {
  /// Returns a new [ComAdobeCqAuditPurgePagesProperties] instance.
  ComAdobeCqAuditPurgePagesProperties({
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
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqAuditPurgePagesProperties &&
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
  String toString() => 'ComAdobeCqAuditPurgePagesProperties[auditlogPeriodRulePeriodName=$auditlogPeriodRulePeriodName, auditlogPeriodRulePeriodContentpath=$auditlogPeriodRulePeriodContentpath, auditlogPeriodRulePeriodMinimumage=$auditlogPeriodRulePeriodMinimumage, auditlogPeriodRulePeriodTypes=$auditlogPeriodRulePeriodTypes]';

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

  /// Returns a new [ComAdobeCqAuditPurgePagesProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqAuditPurgePagesProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqAuditPurgePagesProperties(
        auditlogPeriodRulePeriodName: ConfigNodePropertyString.fromJson(json[r'auditlog.rule.name']),
        auditlogPeriodRulePeriodContentpath: ConfigNodePropertyString.fromJson(json[r'auditlog.rule.contentpath']),
        auditlogPeriodRulePeriodMinimumage: ConfigNodePropertyInteger.fromJson(json[r'auditlog.rule.minimumage']),
        auditlogPeriodRulePeriodTypes: ConfigNodePropertyDropDown.fromJson(json[r'auditlog.rule.types']),
      );
    }
    return null;
  }

  static List<ComAdobeCqAuditPurgePagesProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqAuditPurgePagesProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqAuditPurgePagesProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqAuditPurgePagesProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqAuditPurgePagesProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqAuditPurgePagesProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqAuditPurgePagesProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqAuditPurgePagesProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqAuditPurgePagesProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqAuditPurgePagesProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

