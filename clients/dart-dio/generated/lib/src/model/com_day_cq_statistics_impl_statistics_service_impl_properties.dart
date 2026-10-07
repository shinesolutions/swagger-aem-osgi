//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_statistics_impl_statistics_service_impl_properties.g.dart';

/// ComDayCqStatisticsImplStatisticsServiceImplProperties
///
/// Properties:
/// * [schedulerPeriodPeriod] 
/// * [schedulerPeriodConcurrent] 
/// * [path] 
/// * [workspace] 
/// * [keywordsPath] 
/// * [asyncEntries] 
@BuiltValue()
abstract class ComDayCqStatisticsImplStatisticsServiceImplProperties implements Built<ComDayCqStatisticsImplStatisticsServiceImplProperties, ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.period')
  ConfigNodePropertyInteger? get schedulerPeriodPeriod;

  @BuiltValueField(wireName: r'scheduler.concurrent')
  ConfigNodePropertyBoolean? get schedulerPeriodConcurrent;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'workspace')
  ConfigNodePropertyString? get workspace;

  @BuiltValueField(wireName: r'keywordsPath')
  ConfigNodePropertyString? get keywordsPath;

  @BuiltValueField(wireName: r'asyncEntries')
  ConfigNodePropertyBoolean? get asyncEntries;

  ComDayCqStatisticsImplStatisticsServiceImplProperties._();

  factory ComDayCqStatisticsImplStatisticsServiceImplProperties([void updates(ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder b)]) = _$ComDayCqStatisticsImplStatisticsServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqStatisticsImplStatisticsServiceImplProperties> get serializer => _$ComDayCqStatisticsImplStatisticsServiceImplPropertiesSerializer();
}

class _$ComDayCqStatisticsImplStatisticsServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqStatisticsImplStatisticsServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqStatisticsImplStatisticsServiceImplProperties, _$ComDayCqStatisticsImplStatisticsServiceImplProperties];

  @override
  final String wireName = r'ComDayCqStatisticsImplStatisticsServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqStatisticsImplStatisticsServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodPeriod != null) {
      yield r'scheduler.period';
      yield serializers.serialize(
        object.schedulerPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.schedulerPeriodConcurrent != null) {
      yield r'scheduler.concurrent';
      yield serializers.serialize(
        object.schedulerPeriodConcurrent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.workspace != null) {
      yield r'workspace';
      yield serializers.serialize(
        object.workspace,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.keywordsPath != null) {
      yield r'keywordsPath';
      yield serializers.serialize(
        object.keywordsPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.asyncEntries != null) {
      yield r'asyncEntries';
      yield serializers.serialize(
        object.asyncEntries,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqStatisticsImplStatisticsServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.schedulerPeriodPeriod.replace(valueDes);
          break;
        case r'scheduler.concurrent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.schedulerPeriodConcurrent.replace(valueDes);
          break;
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'workspace':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.workspace.replace(valueDes);
          break;
        case r'keywordsPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.keywordsPath.replace(valueDes);
          break;
        case r'asyncEntries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.asyncEntries.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqStatisticsImplStatisticsServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqStatisticsImplStatisticsServiceImplPropertiesBuilder();
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

