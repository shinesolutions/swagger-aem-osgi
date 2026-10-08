//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties.g.dart';

/// ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
@BuiltValue()
abstract class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties implements Built<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties, ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties._();

  factory ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties([void updates(ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder b)]) = _$ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties> get serializer => _$ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesSerializer();
}

class _$ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties, _$ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties];

  @override
  final String wireName = r'ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder();
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

