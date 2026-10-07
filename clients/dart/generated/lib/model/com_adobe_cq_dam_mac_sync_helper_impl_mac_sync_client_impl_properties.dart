//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties {
  /// Returns a new [ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties] instance.
  ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties({
    this.comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties &&
    other.comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout == comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout == null ? 0 : comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout!.hashCode);

  @override
  String toString() => 'ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties[comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout=$comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout != null) {
      json[r'com.adobe.dam.mac.sync.client.so.timeout'] = this.comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout;
    } else {
      json[r'com.adobe.dam.mac.sync.client.so.timeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(
        comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'com.adobe.dam.mac.sync.client.so.timeout']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

