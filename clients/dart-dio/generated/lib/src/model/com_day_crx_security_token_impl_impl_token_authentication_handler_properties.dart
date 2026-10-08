//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_crx_security_token_impl_impl_token_authentication_handler_properties.g.dart';

/// ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
///
/// Properties:
/// * [path] 
/// * [tokenPeriodRequiredPeriodAttr] 
/// * [tokenPeriodAlternatePeriodUrl] 
/// * [tokenPeriodEncapsulated] 
/// * [skipPeriodTokenPeriodRefresh] 
@BuiltValue()
abstract class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties implements Built<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'token.required.attr')
  ConfigNodePropertyDropDown? get tokenPeriodRequiredPeriodAttr;

  @BuiltValueField(wireName: r'token.alternate.url')
  ConfigNodePropertyString? get tokenPeriodAlternatePeriodUrl;

  @BuiltValueField(wireName: r'token.encapsulated')
  ConfigNodePropertyBoolean? get tokenPeriodEncapsulated;

  @BuiltValueField(wireName: r'skip.token.refresh')
  ConfigNodePropertyArray? get skipPeriodTokenPeriodRefresh;

  ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties._();

  factory ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties([void updates(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder b)]) = _$ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties> get serializer => _$ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesSerializer();
}

class _$ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties, _$ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties];

  @override
  final String wireName = r'ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tokenPeriodRequiredPeriodAttr != null) {
      yield r'token.required.attr';
      yield serializers.serialize(
        object.tokenPeriodRequiredPeriodAttr,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.tokenPeriodAlternatePeriodUrl != null) {
      yield r'token.alternate.url';
      yield serializers.serialize(
        object.tokenPeriodAlternatePeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tokenPeriodEncapsulated != null) {
      yield r'token.encapsulated';
      yield serializers.serialize(
        object.tokenPeriodEncapsulated,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.skipPeriodTokenPeriodRefresh != null) {
      yield r'skip.token.refresh';
      yield serializers.serialize(
        object.skipPeriodTokenPeriodRefresh,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'token.required.attr':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.tokenPeriodRequiredPeriodAttr.replace(valueDes);
          break;
        case r'token.alternate.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tokenPeriodAlternatePeriodUrl.replace(valueDes);
          break;
        case r'token.encapsulated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.tokenPeriodEncapsulated.replace(valueDes);
          break;
        case r'skip.token.refresh':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.skipPeriodTokenPeriodRefresh.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesBuilder();
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

