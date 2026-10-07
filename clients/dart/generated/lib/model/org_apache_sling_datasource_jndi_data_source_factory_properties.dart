//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
  /// Returns a new [OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties] instance.
  OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties({
    this.datasourcePeriodName,
    this.datasourcePeriodSvcPeriodPropPeriodName,
    this.datasourcePeriodJndiPeriodName,
    this.jndiPeriodProperties,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? datasourcePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? datasourcePeriodSvcPeriodPropPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? datasourcePeriodJndiPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? jndiPeriodProperties;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties &&
    other.datasourcePeriodName == datasourcePeriodName &&
    other.datasourcePeriodSvcPeriodPropPeriodName == datasourcePeriodSvcPeriodPropPeriodName &&
    other.datasourcePeriodJndiPeriodName == datasourcePeriodJndiPeriodName &&
    other.jndiPeriodProperties == jndiPeriodProperties;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (datasourcePeriodName == null ? 0 : datasourcePeriodName!.hashCode) +
    (datasourcePeriodSvcPeriodPropPeriodName == null ? 0 : datasourcePeriodSvcPeriodPropPeriodName!.hashCode) +
    (datasourcePeriodJndiPeriodName == null ? 0 : datasourcePeriodJndiPeriodName!.hashCode) +
    (jndiPeriodProperties == null ? 0 : jndiPeriodProperties!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties[datasourcePeriodName=$datasourcePeriodName, datasourcePeriodSvcPeriodPropPeriodName=$datasourcePeriodSvcPeriodPropPeriodName, datasourcePeriodJndiPeriodName=$datasourcePeriodJndiPeriodName, jndiPeriodProperties=$jndiPeriodProperties]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.datasourcePeriodName != null) {
      json[r'datasource.name'] = this.datasourcePeriodName;
    } else {
      json[r'datasource.name'] = null;
    }
    if (this.datasourcePeriodSvcPeriodPropPeriodName != null) {
      json[r'datasource.svc.prop.name'] = this.datasourcePeriodSvcPeriodPropPeriodName;
    } else {
      json[r'datasource.svc.prop.name'] = null;
    }
    if (this.datasourcePeriodJndiPeriodName != null) {
      json[r'datasource.jndi.name'] = this.datasourcePeriodJndiPeriodName;
    } else {
      json[r'datasource.jndi.name'] = null;
    }
    if (this.jndiPeriodProperties != null) {
      json[r'jndi.properties'] = this.jndiPeriodProperties;
    } else {
      json[r'jndi.properties'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(
        datasourcePeriodName: ConfigNodePropertyString.fromJson(json[r'datasource.name']),
        datasourcePeriodSvcPeriodPropPeriodName: ConfigNodePropertyString.fromJson(json[r'datasource.svc.prop.name']),
        datasourcePeriodJndiPeriodName: ConfigNodePropertyString.fromJson(json[r'datasource.jndi.name']),
        jndiPeriodProperties: ConfigNodePropertyArray.fromJson(json[r'jndi.properties']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

