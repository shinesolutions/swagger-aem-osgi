//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties.g.dart';

/// ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
///
/// Properties:
/// * [authoringUIModeServicePeriodDefault] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties implements Built<ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties, ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'authoringUIModeService.default')
  ConfigNodePropertyString? get authoringUIModeServicePeriodDefault;

  ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties._();

  factory ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties([void updates(ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties> get serializer => _$ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties, _$ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.authoringUIModeServicePeriodDefault != null) {
      yield r'authoringUIModeService.default';
      yield serializers.serialize(
        object.authoringUIModeServicePeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'authoringUIModeService.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authoringUIModeServicePeriodDefault.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder();
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

