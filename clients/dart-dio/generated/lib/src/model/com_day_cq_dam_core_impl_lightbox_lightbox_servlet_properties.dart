//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_lightbox_lightbox_servlet_properties.g.dart';

/// ComDayCqDamCoreImplLightboxLightboxServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodPaths] 
/// * [slingPeriodServletPeriodMethods] 
/// * [cqPeriodDamPeriodEnablePeriodAnonymous] 
@BuiltValue()
abstract class ComDayCqDamCoreImplLightboxLightboxServletProperties implements Built<ComDayCqDamCoreImplLightboxLightboxServletProperties, ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.paths')
  ConfigNodePropertyString? get slingPeriodServletPeriodPaths;

  @BuiltValueField(wireName: r'sling.servlet.methods')
  ConfigNodePropertyArray? get slingPeriodServletPeriodMethods;

  @BuiltValueField(wireName: r'cq.dam.enable.anonymous')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodEnablePeriodAnonymous;

  ComDayCqDamCoreImplLightboxLightboxServletProperties._();

  factory ComDayCqDamCoreImplLightboxLightboxServletProperties([void updates(ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplLightboxLightboxServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplLightboxLightboxServletProperties> get serializer => _$ComDayCqDamCoreImplLightboxLightboxServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplLightboxLightboxServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplLightboxLightboxServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplLightboxLightboxServletProperties, _$ComDayCqDamCoreImplLightboxLightboxServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplLightboxLightboxServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplLightboxLightboxServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodPaths != null) {
      yield r'sling.servlet.paths';
      yield serializers.serialize(
        object.slingPeriodServletPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodMethods != null) {
      yield r'sling.servlet.methods';
      yield serializers.serialize(
        object.slingPeriodServletPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodDamPeriodEnablePeriodAnonymous != null) {
      yield r'cq.dam.enable.anonymous';
      yield serializers.serialize(
        object.cqPeriodDamPeriodEnablePeriodAnonymous,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplLightboxLightboxServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodPaths.replace(valueDes);
          break;
        case r'sling.servlet.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodMethods.replace(valueDes);
          break;
        case r'cq.dam.enable.anonymous':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodEnablePeriodAnonymous.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplLightboxLightboxServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder();
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

