//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {
  /// Returns a new [ComAdobeGraniteHttpcacheFileFileCacheStoreProperties] instance.
  ComAdobeGraniteHttpcacheFileFileCacheStoreProperties({
    this.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot,
    this.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteHttpcacheFileFileCacheStoreProperties &&
    other.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot == comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot &&
    other.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost == comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot == null ? 0 : comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot!.hashCode) +
    (comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost == null ? 0 : comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteHttpcacheFileFileCacheStoreProperties[comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot=$comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot, comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost=$comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot != null) {
      json[r'com.adobe.granite.httpcache.file.documentRoot'] = this.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot;
    } else {
      json[r'com.adobe.granite.httpcache.file.documentRoot'] = null;
    }
    if (this.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost != null) {
      json[r'com.adobe.granite.httpcache.file.includeHost'] = this.comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost;
    } else {
      json[r'com.adobe.granite.httpcache.file.includeHost'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteHttpcacheFileFileCacheStoreProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteHttpcacheFileFileCacheStoreProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(
        comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodDocumentRoot: ConfigNodePropertyString.fromJson(json[r'com.adobe.granite.httpcache.file.documentRoot']),
        comPeriodAdobePeriodGranitePeriodHttpcachePeriodFilePeriodIncludeHost: ConfigNodePropertyString.fromJson(json[r'com.adobe.granite.httpcache.file.includeHost']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteHttpcacheFileFileCacheStoreProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteHttpcacheFileFileCacheStoreProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteHttpcacheFileFileCacheStoreProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteHttpcacheFileFileCacheStoreProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteHttpcacheFileFileCacheStoreProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteHttpcacheFileFileCacheStoreProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteHttpcacheFileFileCacheStoreProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

