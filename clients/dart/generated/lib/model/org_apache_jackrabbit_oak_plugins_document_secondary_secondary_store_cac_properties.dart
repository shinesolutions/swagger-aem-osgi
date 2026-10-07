//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties {
  /// Returns a new [OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties] instance.
  OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties({
    this.includedPaths,
    this.enableAsyncObserver,
    this.observerQueueSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? includedPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableAsyncObserver;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? observerQueueSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties &&
    other.includedPaths == includedPaths &&
    other.enableAsyncObserver == enableAsyncObserver &&
    other.observerQueueSize == observerQueueSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (includedPaths == null ? 0 : includedPaths!.hashCode) +
    (enableAsyncObserver == null ? 0 : enableAsyncObserver!.hashCode) +
    (observerQueueSize == null ? 0 : observerQueueSize!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties[includedPaths=$includedPaths, enableAsyncObserver=$enableAsyncObserver, observerQueueSize=$observerQueueSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.includedPaths != null) {
      json[r'includedPaths'] = this.includedPaths;
    } else {
      json[r'includedPaths'] = null;
    }
    if (this.enableAsyncObserver != null) {
      json[r'enableAsyncObserver'] = this.enableAsyncObserver;
    } else {
      json[r'enableAsyncObserver'] = null;
    }
    if (this.observerQueueSize != null) {
      json[r'observerQueueSize'] = this.observerQueueSize;
    } else {
      json[r'observerQueueSize'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(
        includedPaths: ConfigNodePropertyArray.fromJson(json[r'includedPaths']),
        enableAsyncObserver: ConfigNodePropertyBoolean.fromJson(json[r'enableAsyncObserver']),
        observerQueueSize: ConfigNodePropertyInteger.fromJson(json[r'observerQueueSize']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

