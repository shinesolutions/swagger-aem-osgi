//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmMsmImplServletsAuditLogServletProperties {
  /// Returns a new [ComDayCqWcmMsmImplServletsAuditLogServletProperties] instance.
  ComDayCqWcmMsmImplServletsAuditLogServletProperties({
    this.auditlogservletPeriodDefaultPeriodEventsPeriodCount,
    this.auditlogservletPeriodDefaultPeriodPath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? auditlogservletPeriodDefaultPeriodEventsPeriodCount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? auditlogservletPeriodDefaultPeriodPath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmMsmImplServletsAuditLogServletProperties &&
    other.auditlogservletPeriodDefaultPeriodEventsPeriodCount == auditlogservletPeriodDefaultPeriodEventsPeriodCount &&
    other.auditlogservletPeriodDefaultPeriodPath == auditlogservletPeriodDefaultPeriodPath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (auditlogservletPeriodDefaultPeriodEventsPeriodCount == null ? 0 : auditlogservletPeriodDefaultPeriodEventsPeriodCount!.hashCode) +
    (auditlogservletPeriodDefaultPeriodPath == null ? 0 : auditlogservletPeriodDefaultPeriodPath!.hashCode);

  @override
  String toString() => 'ComDayCqWcmMsmImplServletsAuditLogServletProperties[auditlogservletPeriodDefaultPeriodEventsPeriodCount=$auditlogservletPeriodDefaultPeriodEventsPeriodCount, auditlogservletPeriodDefaultPeriodPath=$auditlogservletPeriodDefaultPeriodPath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.auditlogservletPeriodDefaultPeriodEventsPeriodCount != null) {
      json[r'auditlogservlet.default.events.count'] = this.auditlogservletPeriodDefaultPeriodEventsPeriodCount;
    } else {
      json[r'auditlogservlet.default.events.count'] = null;
    }
    if (this.auditlogservletPeriodDefaultPeriodPath != null) {
      json[r'auditlogservlet.default.path'] = this.auditlogservletPeriodDefaultPeriodPath;
    } else {
      json[r'auditlogservlet.default.path'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmMsmImplServletsAuditLogServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmMsmImplServletsAuditLogServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmMsmImplServletsAuditLogServletProperties(
        auditlogservletPeriodDefaultPeriodEventsPeriodCount: ConfigNodePropertyInteger.fromJson(json[r'auditlogservlet.default.events.count']),
        auditlogservletPeriodDefaultPeriodPath: ConfigNodePropertyString.fromJson(json[r'auditlogservlet.default.path']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmMsmImplServletsAuditLogServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmMsmImplServletsAuditLogServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmMsmImplServletsAuditLogServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmMsmImplServletsAuditLogServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmMsmImplServletsAuditLogServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmMsmImplServletsAuditLogServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmMsmImplServletsAuditLogServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmMsmImplServletsAuditLogServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmMsmImplServletsAuditLogServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmMsmImplServletsAuditLogServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

