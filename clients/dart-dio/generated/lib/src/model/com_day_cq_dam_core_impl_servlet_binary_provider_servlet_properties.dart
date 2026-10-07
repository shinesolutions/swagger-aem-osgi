//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletBinaryProviderServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodResourceTypes] 
/// * [slingPeriodServletPeriodMethods] 
/// * [cqPeriodDamPeriodDrmPeriodEnable] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletBinaryProviderServletProperties implements Built<ComDayCqDamCoreImplServletBinaryProviderServletProperties, ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.resourceTypes')
  ConfigNodePropertyArray? get slingPeriodServletPeriodResourceTypes;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyArray? get slingPeriodServletPeriodMethods;

  @BuiltValueField(wireName: r'cq.dam.drm.enable')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodDrmPeriodEnable;

  ComDayCqDamCoreImplServletBinaryProviderServletProperties._();

  factory ComDayCqDamCoreImplServletBinaryProviderServletProperties([void updates(ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletBinaryProviderServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletBinaryProviderServletProperties> get serializer => _$ComDayCqDamCoreImplServletBinaryProviderServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletBinaryProviderServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletBinaryProviderServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletBinaryProviderServletProperties, _$ComDayCqDamCoreImplServletBinaryProviderServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletBinaryProviderServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletBinaryProviderServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodResourceTypes != null) {
      yield r'sling.servlet.resourceTypes';
      yield serializers.serialize(
        object.slingPeriodServletPeriodResourceTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodDamPeriodDrmPeriodEnable != null) {
      yield r'cq.dam.drm.enable';
      yield serializers.serialize(
        object.cqPeriodDamPeriodDrmPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletBinaryProviderServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.resourceTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodResourceTypes.replace(valueDes);
          break;
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        case r'cq.dam.drm.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodDrmPeriodEnable.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletBinaryProviderServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder();
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

