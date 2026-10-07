//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_auth_impl_login_selector_handler_properties.g.dart';

/// ComDayCqAuthImplLoginSelectorHandlerProperties
///
/// Properties:
/// * [path] 
/// * [servicePeriodRanking] 
/// * [authPeriodLoginselectorPeriodMappings] 
/// * [authPeriodLoginselectorPeriodChangepwPeriodMappings] 
/// * [authPeriodLoginselectorPeriodDefaultloginpage] 
/// * [authPeriodLoginselectorPeriodDefaultchangepwpage] 
/// * [authPeriodLoginselectorPeriodHandle] 
/// * [authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions] 
@BuiltValue()
abstract class ComDayCqAuthImplLoginSelectorHandlerProperties implements Built<ComDayCqAuthImplLoginSelectorHandlerProperties, ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'auth.loginselector.mappings')
  ConfigNodePropertyArray? get authPeriodLoginselectorPeriodMappings;

  @BuiltValueField(wireName: r'auth.loginselector.changepw.mappings')
  ConfigNodePropertyArray? get authPeriodLoginselectorPeriodChangepwPeriodMappings;

  @BuiltValueField(wireName: r'auth.loginselector.defaultloginpage')
  ConfigNodePropertyString? get authPeriodLoginselectorPeriodDefaultloginpage;

  @BuiltValueField(wireName: r'auth.loginselector.defaultchangepwpage')
  ConfigNodePropertyString? get authPeriodLoginselectorPeriodDefaultchangepwpage;

  @BuiltValueField(wireName: r'auth.loginselector.handle')
  ConfigNodePropertyArray? get authPeriodLoginselectorPeriodHandle;

  @BuiltValueField(wireName: r'auth.loginselector.handle.all.extensions')
  ConfigNodePropertyBoolean? get authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions;

  ComDayCqAuthImplLoginSelectorHandlerProperties._();

  factory ComDayCqAuthImplLoginSelectorHandlerProperties([void updates(ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder b)]) = _$ComDayCqAuthImplLoginSelectorHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAuthImplLoginSelectorHandlerProperties> get serializer => _$ComDayCqAuthImplLoginSelectorHandlerPropertiesSerializer();
}

class _$ComDayCqAuthImplLoginSelectorHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqAuthImplLoginSelectorHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAuthImplLoginSelectorHandlerProperties, _$ComDayCqAuthImplLoginSelectorHandlerProperties];

  @override
  final String wireName = r'ComDayCqAuthImplLoginSelectorHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAuthImplLoginSelectorHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.authPeriodLoginselectorPeriodMappings != null) {
      yield r'auth.loginselector.mappings';
      yield serializers.serialize(
        object.authPeriodLoginselectorPeriodMappings,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.authPeriodLoginselectorPeriodChangepwPeriodMappings != null) {
      yield r'auth.loginselector.changepw.mappings';
      yield serializers.serialize(
        object.authPeriodLoginselectorPeriodChangepwPeriodMappings,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.authPeriodLoginselectorPeriodDefaultloginpage != null) {
      yield r'auth.loginselector.defaultloginpage';
      yield serializers.serialize(
        object.authPeriodLoginselectorPeriodDefaultloginpage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodLoginselectorPeriodDefaultchangepwpage != null) {
      yield r'auth.loginselector.defaultchangepwpage';
      yield serializers.serialize(
        object.authPeriodLoginselectorPeriodDefaultchangepwpage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.authPeriodLoginselectorPeriodHandle != null) {
      yield r'auth.loginselector.handle';
      yield serializers.serialize(
        object.authPeriodLoginselectorPeriodHandle,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions != null) {
      yield r'auth.loginselector.handle.all.extensions';
      yield serializers.serialize(
        object.authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAuthImplLoginSelectorHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder result,
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
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'auth.loginselector.mappings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.authPeriodLoginselectorPeriodMappings.replace(valueDes);
          break;
        case r'auth.loginselector.changepw.mappings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.authPeriodLoginselectorPeriodChangepwPeriodMappings.replace(valueDes);
          break;
        case r'auth.loginselector.defaultloginpage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodLoginselectorPeriodDefaultloginpage.replace(valueDes);
          break;
        case r'auth.loginselector.defaultchangepwpage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodLoginselectorPeriodDefaultchangepwpage.replace(valueDes);
          break;
        case r'auth.loginselector.handle':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.authPeriodLoginselectorPeriodHandle.replace(valueDes);
          break;
        case r'auth.loginselector.handle.all.extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAuthImplLoginSelectorHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAuthImplLoginSelectorHandlerPropertiesBuilder();
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

