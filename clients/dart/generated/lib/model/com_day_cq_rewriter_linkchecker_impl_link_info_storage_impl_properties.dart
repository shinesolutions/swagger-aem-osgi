//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {
  /// Returns a new [ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties] instance.
  ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties({
    this.servicePeriodMaxLinksPerHost,
    this.servicePeriodSaveExternalLinkReferences,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodMaxLinksPerHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? servicePeriodSaveExternalLinkReferences;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties &&
    other.servicePeriodMaxLinksPerHost == servicePeriodMaxLinksPerHost &&
    other.servicePeriodSaveExternalLinkReferences == servicePeriodSaveExternalLinkReferences;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servicePeriodMaxLinksPerHost == null ? 0 : servicePeriodMaxLinksPerHost!.hashCode) +
    (servicePeriodSaveExternalLinkReferences == null ? 0 : servicePeriodSaveExternalLinkReferences!.hashCode);

  @override
  String toString() => 'ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties[servicePeriodMaxLinksPerHost=$servicePeriodMaxLinksPerHost, servicePeriodSaveExternalLinkReferences=$servicePeriodSaveExternalLinkReferences]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servicePeriodMaxLinksPerHost != null) {
      json[r'service.max_links_per_host'] = this.servicePeriodMaxLinksPerHost;
    } else {
      json[r'service.max_links_per_host'] = null;
    }
    if (this.servicePeriodSaveExternalLinkReferences != null) {
      json[r'service.save_external_link_references'] = this.servicePeriodSaveExternalLinkReferences;
    } else {
      json[r'service.save_external_link_references'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(
        servicePeriodMaxLinksPerHost: ConfigNodePropertyInteger.fromJson(json[r'service.max_links_per_host']),
        servicePeriodSaveExternalLinkReferences: ConfigNodePropertyBoolean.fromJson(json[r'service.save_external_link_references']),
      );
    }
    return null;
  }

  static List<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

