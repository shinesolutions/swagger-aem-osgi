//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletCreateAssetServletProperties
///
/// Properties:
/// * [detectDuplicate] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletCreateAssetServletProperties implements Built<ComDayCqDamCoreImplServletCreateAssetServletProperties, ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'detect_duplicate')
  ConfigNodePropertyBoolean? get detectDuplicate;

  ComDayCqDamCoreImplServletCreateAssetServletProperties._();

  factory ComDayCqDamCoreImplServletCreateAssetServletProperties([void updates(ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletCreateAssetServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletCreateAssetServletProperties> get serializer => _$ComDayCqDamCoreImplServletCreateAssetServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletCreateAssetServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletCreateAssetServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletCreateAssetServletProperties, _$ComDayCqDamCoreImplServletCreateAssetServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletCreateAssetServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletCreateAssetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.detectDuplicate != null) {
      yield r'detect_duplicate';
      yield serializers.serialize(
        object.detectDuplicate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletCreateAssetServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'detect_duplicate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.detectDuplicate.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletCreateAssetServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletCreateAssetServletPropertiesBuilder();
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

