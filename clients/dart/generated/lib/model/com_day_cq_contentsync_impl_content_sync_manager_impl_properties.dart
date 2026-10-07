//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqContentsyncImplContentSyncManagerImplProperties {
  /// Returns a new [ComDayCqContentsyncImplContentSyncManagerImplProperties] instance.
  ComDayCqContentsyncImplContentSyncManagerImplProperties({
    this.contentsyncPeriodFallbackPeriodAuthorizable,
    this.contentsyncPeriodFallbackPeriodUpdateuser,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? contentsyncPeriodFallbackPeriodAuthorizable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? contentsyncPeriodFallbackPeriodUpdateuser;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqContentsyncImplContentSyncManagerImplProperties &&
    other.contentsyncPeriodFallbackPeriodAuthorizable == contentsyncPeriodFallbackPeriodAuthorizable &&
    other.contentsyncPeriodFallbackPeriodUpdateuser == contentsyncPeriodFallbackPeriodUpdateuser;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentsyncPeriodFallbackPeriodAuthorizable == null ? 0 : contentsyncPeriodFallbackPeriodAuthorizable!.hashCode) +
    (contentsyncPeriodFallbackPeriodUpdateuser == null ? 0 : contentsyncPeriodFallbackPeriodUpdateuser!.hashCode);

  @override
  String toString() => 'ComDayCqContentsyncImplContentSyncManagerImplProperties[contentsyncPeriodFallbackPeriodAuthorizable=$contentsyncPeriodFallbackPeriodAuthorizable, contentsyncPeriodFallbackPeriodUpdateuser=$contentsyncPeriodFallbackPeriodUpdateuser]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.contentsyncPeriodFallbackPeriodAuthorizable != null) {
      json[r'contentsync.fallback.authorizable'] = this.contentsyncPeriodFallbackPeriodAuthorizable;
    } else {
      json[r'contentsync.fallback.authorizable'] = null;
    }
    if (this.contentsyncPeriodFallbackPeriodUpdateuser != null) {
      json[r'contentsync.fallback.updateuser'] = this.contentsyncPeriodFallbackPeriodUpdateuser;
    } else {
      json[r'contentsync.fallback.updateuser'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqContentsyncImplContentSyncManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqContentsyncImplContentSyncManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqContentsyncImplContentSyncManagerImplProperties(
        contentsyncPeriodFallbackPeriodAuthorizable: ConfigNodePropertyString.fromJson(json[r'contentsync.fallback.authorizable']),
        contentsyncPeriodFallbackPeriodUpdateuser: ConfigNodePropertyString.fromJson(json[r'contentsync.fallback.updateuser']),
      );
    }
    return null;
  }

  static List<ComDayCqContentsyncImplContentSyncManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqContentsyncImplContentSyncManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqContentsyncImplContentSyncManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqContentsyncImplContentSyncManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqContentsyncImplContentSyncManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqContentsyncImplContentSyncManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqContentsyncImplContentSyncManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqContentsyncImplContentSyncManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqContentsyncImplContentSyncManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqContentsyncImplContentSyncManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

