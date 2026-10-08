//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingModelsImplModelAdapterFactoryProperties {
  /// Returns a new [OrgApacheSlingModelsImplModelAdapterFactoryProperties] instance.
  OrgApacheSlingModelsImplModelAdapterFactoryProperties({
    this.osgiPeriodHttpPeriodWhiteboardPeriodListener,
    this.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect,
    this.maxPeriodRecursionPeriodDepth,
    this.cleanupPeriodJobPeriodPeriod,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? osgiPeriodHttpPeriodWhiteboardPeriodListener;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxPeriodRecursionPeriodDepth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cleanupPeriodJobPeriodPeriod;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingModelsImplModelAdapterFactoryProperties &&
    other.osgiPeriodHttpPeriodWhiteboardPeriodListener == osgiPeriodHttpPeriodWhiteboardPeriodListener &&
    other.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect == osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect &&
    other.maxPeriodRecursionPeriodDepth == maxPeriodRecursionPeriodDepth &&
    other.cleanupPeriodJobPeriodPeriod == cleanupPeriodJobPeriodPeriod;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (osgiPeriodHttpPeriodWhiteboardPeriodListener == null ? 0 : osgiPeriodHttpPeriodWhiteboardPeriodListener!.hashCode) +
    (osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect == null ? 0 : osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect!.hashCode) +
    (maxPeriodRecursionPeriodDepth == null ? 0 : maxPeriodRecursionPeriodDepth!.hashCode) +
    (cleanupPeriodJobPeriodPeriod == null ? 0 : cleanupPeriodJobPeriodPeriod!.hashCode);

  @override
  String toString() => 'OrgApacheSlingModelsImplModelAdapterFactoryProperties[osgiPeriodHttpPeriodWhiteboardPeriodListener=$osgiPeriodHttpPeriodWhiteboardPeriodListener, osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect=$osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect, maxPeriodRecursionPeriodDepth=$maxPeriodRecursionPeriodDepth, cleanupPeriodJobPeriodPeriod=$cleanupPeriodJobPeriodPeriod]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.osgiPeriodHttpPeriodWhiteboardPeriodListener != null) {
      json[r'osgi.http.whiteboard.listener'] = this.osgiPeriodHttpPeriodWhiteboardPeriodListener;
    } else {
      json[r'osgi.http.whiteboard.listener'] = null;
    }
    if (this.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect != null) {
      json[r'osgi.http.whiteboard.context.select'] = this.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;
    } else {
      json[r'osgi.http.whiteboard.context.select'] = null;
    }
    if (this.maxPeriodRecursionPeriodDepth != null) {
      json[r'max.recursion.depth'] = this.maxPeriodRecursionPeriodDepth;
    } else {
      json[r'max.recursion.depth'] = null;
    }
    if (this.cleanupPeriodJobPeriodPeriod != null) {
      json[r'cleanup.job.period'] = this.cleanupPeriodJobPeriodPeriod;
    } else {
      json[r'cleanup.job.period'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingModelsImplModelAdapterFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingModelsImplModelAdapterFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingModelsImplModelAdapterFactoryProperties(
        osgiPeriodHttpPeriodWhiteboardPeriodListener: ConfigNodePropertyString.fromJson(json[r'osgi.http.whiteboard.listener']),
        osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect: ConfigNodePropertyString.fromJson(json[r'osgi.http.whiteboard.context.select']),
        maxPeriodRecursionPeriodDepth: ConfigNodePropertyInteger.fromJson(json[r'max.recursion.depth']),
        cleanupPeriodJobPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'cleanup.job.period']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingModelsImplModelAdapterFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingModelsImplModelAdapterFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingModelsImplModelAdapterFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingModelsImplModelAdapterFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingModelsImplModelAdapterFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingModelsImplModelAdapterFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingModelsImplModelAdapterFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingModelsImplModelAdapterFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingModelsImplModelAdapterFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingModelsImplModelAdapterFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

