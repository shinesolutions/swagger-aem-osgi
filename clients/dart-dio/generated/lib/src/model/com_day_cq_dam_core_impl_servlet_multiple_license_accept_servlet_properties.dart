//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodDrmPeriodEnable] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties implements Built<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.drm.enable')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodDrmPeriodEnable;

  ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties._();

  factory ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties([void updates(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties> get serializer => _$ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties, _$ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesBuilder();
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

