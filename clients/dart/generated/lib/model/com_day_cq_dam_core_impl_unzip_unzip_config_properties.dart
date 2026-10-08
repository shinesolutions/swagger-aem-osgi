//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplUnzipUnzipConfigProperties {
  /// Returns a new [ComDayCqDamCoreImplUnzipUnzipConfigProperties] instance.
  ComDayCqDamCoreImplUnzipUnzipConfigProperties({
    this.cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize,
    this.cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplUnzipUnzipConfigProperties &&
    other.cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize == cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize &&
    other.cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding == cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize == null ? 0 : cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize!.hashCode) +
    (cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding == null ? 0 : cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplUnzipUnzipConfigProperties[cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize=$cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize, cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding=$cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize != null) {
      json[r'cq.dam.config.unzip.maxuncompressedsize'] = this.cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize;
    } else {
      json[r'cq.dam.config.unzip.maxuncompressedsize'] = null;
    }
    if (this.cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding != null) {
      json[r'cq.dam.config.unzip.encoding'] = this.cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding;
    } else {
      json[r'cq.dam.config.unzip.encoding'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplUnzipUnzipConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplUnzipUnzipConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplUnzipUnzipConfigProperties(
        cqPeriodDamPeriodConfigPeriodUnzipPeriodMaxuncompressedsize: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.config.unzip.maxuncompressedsize']),
        cqPeriodDamPeriodConfigPeriodUnzipPeriodEncoding: ConfigNodePropertyString.fromJson(json[r'cq.dam.config.unzip.encoding']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplUnzipUnzipConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplUnzipUnzipConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplUnzipUnzipConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplUnzipUnzipConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplUnzipUnzipConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplUnzipUnzipConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplUnzipUnzipConfigProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplUnzipUnzipConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplUnzipUnzipConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplUnzipUnzipConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

