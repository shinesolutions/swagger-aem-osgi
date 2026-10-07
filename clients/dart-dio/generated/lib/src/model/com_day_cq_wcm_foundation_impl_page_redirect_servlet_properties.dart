//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_impl_page_redirect_servlet_properties.g.dart';

/// ComDayCqWcmFoundationImplPageRedirectServletProperties
///
/// Properties:
/// * [excludedPeriodResourcePeriodTypes] 
@BuiltValue()
abstract class ComDayCqWcmFoundationImplPageRedirectServletProperties implements Built<ComDayCqWcmFoundationImplPageRedirectServletProperties, ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'excluded.resource.types')
  ConfigNodePropertyArray? get excludedPeriodResourcePeriodTypes;

  ComDayCqWcmFoundationImplPageRedirectServletProperties._();

  factory ComDayCqWcmFoundationImplPageRedirectServletProperties([void updates(ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder b)]) = _$ComDayCqWcmFoundationImplPageRedirectServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationImplPageRedirectServletProperties> get serializer => _$ComDayCqWcmFoundationImplPageRedirectServletPropertiesSerializer();
}

class _$ComDayCqWcmFoundationImplPageRedirectServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationImplPageRedirectServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationImplPageRedirectServletProperties, _$ComDayCqWcmFoundationImplPageRedirectServletProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationImplPageRedirectServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationImplPageRedirectServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.excludedPeriodResourcePeriodTypes != null) {
      yield r'excluded.resource.types';
      yield serializers.serialize(
        object.excludedPeriodResourcePeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationImplPageRedirectServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'excluded.resource.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.excludedPeriodResourcePeriodTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationImplPageRedirectServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder();
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

