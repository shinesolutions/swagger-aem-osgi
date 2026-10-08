//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_impl_http_auth_handler_properties.g.dart';

/// ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
///
/// Properties:
/// * [path] 
/// * [authPeriodHttpPeriodNologin] 
/// * [authPeriodHttpPeriodRealm] 
/// * [authPeriodDefaultPeriodLoginpage] 
/// * [authPeriodCredPeriodForm] 
/// * [authPeriodCredPeriodUtf8] 
@BuiltValue()
abstract class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties implements Built<ComDayCqWcmFoundationImplHTTPAuthHandlerProperties, ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'auth.http.nologin')
  ConfigNodePropertyBoolean? get authPeriodHttpPeriodNologin;

  @BuiltValueField(wireName: r'auth.http.realm')
  ConfigNodePropertyString? get authPeriodHttpPeriodRealm;

  @BuiltValueField(wireName: r'auth.default.loginpage')
  ConfigNodePropertyString? get authPeriodDefaultPeriodLoginpage;

  @BuiltValueField(wireName: r'auth.cred.form')
  ConfigNodePropertyArray? get authPeriodCredPeriodForm;

  @BuiltValueField(wireName: r'auth.cred.utf8')
  ConfigNodePropertyArray? get authPeriodCredPeriodUtf8;

  ComDayCqWcmFoundationImplHTTPAuthHandlerProperties._();

  factory ComDayCqWcmFoundationImplHTTPAuthHandlerProperties([void updates(ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder b)]) = _$ComDayCqWcmFoundationImplHTTPAuthHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationImplHTTPAuthHandlerProperties> get serializer => _$ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesSerializer();
}

class _$ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationImplHTTPAuthHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationImplHTTPAuthHandlerProperties, _$ComDayCqWcmFoundationImplHTTPAuthHandlerProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationImplHTTPAuthHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationImplHTTPAuthHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodHttpPeriodNologin != null) {
      yield r'auth.http.nologin';
      yield serializers.serialize(
        object.authPeriodHttpPeriodNologin,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.authPeriodHttpPeriodRealm != null) {
      yield r'auth.http.realm';
      yield serializers.serialize(
        object.authPeriodHttpPeriodRealm,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodDefaultPeriodLoginpage != null) {
      yield r'auth.default.loginpage';
      yield serializers.serialize(
        object.authPeriodDefaultPeriodLoginpage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodCredPeriodForm != null) {
      yield r'auth.cred.form';
      yield serializers.serialize(
        object.authPeriodCredPeriodForm,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.authPeriodCredPeriodUtf8 != null) {
      yield r'auth.cred.utf8';
      yield serializers.serialize(
        object.authPeriodCredPeriodUtf8,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationImplHTTPAuthHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder result,
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
        case r'auth.http.nologin':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.authPeriodHttpPeriodNologin.replace(valueDes);
          break;
        case r'auth.http.realm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodHttpPeriodRealm.replace(valueDes);
          break;
        case r'auth.default.loginpage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodDefaultPeriodLoginpage.replace(valueDes);
          break;
        case r'auth.cred.form':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.authPeriodCredPeriodForm.replace(valueDes);
          break;
        case r'auth.cred.utf8':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.authPeriodCredPeriodUtf8.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationImplHTTPAuthHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationImplHTTPAuthHandlerPropertiesBuilder();
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

