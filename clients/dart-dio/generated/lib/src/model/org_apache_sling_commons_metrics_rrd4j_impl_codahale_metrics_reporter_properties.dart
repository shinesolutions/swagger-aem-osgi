//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties.g.dart';

/// OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
///
/// Properties:
/// * [datasources] 
/// * [step] 
/// * [archives] 
/// * [path] 
@BuiltValue()
abstract class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties implements Built<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder> {
  @BuiltValueField(wireName: r'datasources')
  ConfigNodePropertyArray? get datasources;

  @BuiltValueField(wireName: r'step')
  ConfigNodePropertyInteger? get step;

  @BuiltValueField(wireName: r'archives')
  ConfigNodePropertyArray? get archives;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties._();

  factory OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties([void updates(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder b)]) = _$OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties> get serializer => _$OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesSerializer();
}

class _$OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties, _$OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.datasources != null) {
      yield r'datasources';
      yield serializers.serialize(
        object.datasources,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.step != null) {
      yield r'step';
      yield serializers.serialize(
        object.step,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.archives != null) {
      yield r'archives';
      yield serializers.serialize(
        object.archives,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'datasources':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.datasources.replace(valueDes);
          break;
        case r'step':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.step.replace(valueDes);
          break;
        case r'archives':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.archives.replace(valueDes);
          break;
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

