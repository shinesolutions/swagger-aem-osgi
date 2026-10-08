//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {
  /// Returns a new [ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties] instance.
  ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties({
    this.xmphandlerPeriodCqPeriodFormats,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? xmphandlerPeriodCqPeriodFormats;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties &&
    other.xmphandlerPeriodCqPeriodFormats == xmphandlerPeriodCqPeriodFormats;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (xmphandlerPeriodCqPeriodFormats == null ? 0 : xmphandlerPeriodCqPeriodFormats!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties[xmphandlerPeriodCqPeriodFormats=$xmphandlerPeriodCqPeriodFormats]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.xmphandlerPeriodCqPeriodFormats != null) {
      json[r'xmphandler.cq.formats'] = this.xmphandlerPeriodCqPeriodFormats;
    } else {
      json[r'xmphandler.cq.formats'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(
        xmphandlerPeriodCqPeriodFormats: ConfigNodePropertyArray.fromJson(json[r'xmphandler.cq.formats']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

