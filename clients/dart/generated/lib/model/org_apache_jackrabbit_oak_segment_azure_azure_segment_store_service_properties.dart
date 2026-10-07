//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {
  /// Returns a new [OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties] instance.
  OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties({
    this.accountName,
    this.containerName,
    this.accessKey,
    this.rootPath,
    this.connectionURL,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? accountName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? containerName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? accessKey;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? rootPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? connectionURL;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties &&
    other.accountName == accountName &&
    other.containerName == containerName &&
    other.accessKey == accessKey &&
    other.rootPath == rootPath &&
    other.connectionURL == connectionURL;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accountName == null ? 0 : accountName!.hashCode) +
    (containerName == null ? 0 : containerName!.hashCode) +
    (accessKey == null ? 0 : accessKey!.hashCode) +
    (rootPath == null ? 0 : rootPath!.hashCode) +
    (connectionURL == null ? 0 : connectionURL!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties[accountName=$accountName, containerName=$containerName, accessKey=$accessKey, rootPath=$rootPath, connectionURL=$connectionURL]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.accountName != null) {
      json[r'accountName'] = this.accountName;
    } else {
      json[r'accountName'] = null;
    }
    if (this.containerName != null) {
      json[r'containerName'] = this.containerName;
    } else {
      json[r'containerName'] = null;
    }
    if (this.accessKey != null) {
      json[r'accessKey'] = this.accessKey;
    } else {
      json[r'accessKey'] = null;
    }
    if (this.rootPath != null) {
      json[r'rootPath'] = this.rootPath;
    } else {
      json[r'rootPath'] = null;
    }
    if (this.connectionURL != null) {
      json[r'connectionURL'] = this.connectionURL;
    } else {
      json[r'connectionURL'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(
        accountName: ConfigNodePropertyString.fromJson(json[r'accountName']),
        containerName: ConfigNodePropertyString.fromJson(json[r'containerName']),
        accessKey: ConfigNodePropertyString.fromJson(json[r'accessKey']),
        rootPath: ConfigNodePropertyString.fromJson(json[r'rootPath']),
        connectionURL: ConfigNodePropertyString.fromJson(json[r'connectionURL']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

