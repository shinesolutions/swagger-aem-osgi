//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_rendition_maker_impl_properties.g.dart';

/// ComDayCqDamCoreImplRenditionMakerImplProperties
///
/// Properties:
/// * [xmpPeriodPropagate] 
/// * [xmpPeriodExcludes] 
@BuiltValue()
abstract class ComDayCqDamCoreImplRenditionMakerImplProperties implements Built<ComDayCqDamCoreImplRenditionMakerImplProperties, ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'xmp.propagate')
  ConfigNodePropertyBoolean? get xmpPeriodPropagate;

  @BuiltValueField(wireName: r'xmp.excludes')
  ConfigNodePropertyArray? get xmpPeriodExcludes;

  ComDayCqDamCoreImplRenditionMakerImplProperties._();

  factory ComDayCqDamCoreImplRenditionMakerImplProperties([void updates(ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder b)]) = _$ComDayCqDamCoreImplRenditionMakerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplRenditionMakerImplProperties> get serializer => _$ComDayCqDamCoreImplRenditionMakerImplPropertiesSerializer();
}

class _$ComDayCqDamCoreImplRenditionMakerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplRenditionMakerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplRenditionMakerImplProperties, _$ComDayCqDamCoreImplRenditionMakerImplProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplRenditionMakerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplRenditionMakerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.xmpPeriodPropagate != null) {
      yield r'xmp.propagate';
      yield serializers.serialize(
        object.xmpPeriodPropagate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.xmpPeriodExcludes != null) {
      yield r'xmp.excludes';
      yield serializers.serialize(
        object.xmpPeriodExcludes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplRenditionMakerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'xmp.propagate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.xmpPeriodPropagate.replace(valueDes);
          break;
        case r'xmp.excludes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.xmpPeriodExcludes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplRenditionMakerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplRenditionMakerImplPropertiesBuilder();
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

