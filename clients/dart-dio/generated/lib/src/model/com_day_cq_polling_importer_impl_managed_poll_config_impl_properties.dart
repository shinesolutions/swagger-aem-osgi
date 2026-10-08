//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_polling_importer_impl_managed_poll_config_impl_properties.g.dart';

/// ComDayCqPollingImporterImplManagedPollConfigImplProperties
///
/// Properties:
/// * [id] 
/// * [enabled] 
/// * [reference] 
/// * [interval] 
/// * [expression] 
/// * [source_] 
/// * [target] 
/// * [login] 
/// * [password] 
@BuiltValue()
abstract class ComDayCqPollingImporterImplManagedPollConfigImplProperties implements Built<ComDayCqPollingImporterImplManagedPollConfigImplProperties, ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'id')
  ConfigNodePropertyString? get id;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'reference')
  ConfigNodePropertyBoolean? get reference;

  @BuiltValueField(wireName: r'interval')
  ConfigNodePropertyInteger? get interval;

  @BuiltValueField(wireName: r'expression')
  ConfigNodePropertyString? get expression;

  @BuiltValueField(wireName: r'source')
  ConfigNodePropertyString? get source_;

  @BuiltValueField(wireName: r'target')
  ConfigNodePropertyString? get target;

  @BuiltValueField(wireName: r'login')
  ConfigNodePropertyString? get login;

  @BuiltValueField(wireName: r'password')
  ConfigNodePropertyString? get password;

  ComDayCqPollingImporterImplManagedPollConfigImplProperties._();

  factory ComDayCqPollingImporterImplManagedPollConfigImplProperties([void updates(ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder b)]) = _$ComDayCqPollingImporterImplManagedPollConfigImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqPollingImporterImplManagedPollConfigImplProperties> get serializer => _$ComDayCqPollingImporterImplManagedPollConfigImplPropertiesSerializer();
}

class _$ComDayCqPollingImporterImplManagedPollConfigImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqPollingImporterImplManagedPollConfigImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqPollingImporterImplManagedPollConfigImplProperties, _$ComDayCqPollingImporterImplManagedPollConfigImplProperties];

  @override
  final String wireName = r'ComDayCqPollingImporterImplManagedPollConfigImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqPollingImporterImplManagedPollConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.reference != null) {
      yield r'reference';
      yield serializers.serialize(
        object.reference,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.interval != null) {
      yield r'interval';
      yield serializers.serialize(
        object.interval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.expression != null) {
      yield r'expression';
      yield serializers.serialize(
        object.expression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.source_ != null) {
      yield r'source';
      yield serializers.serialize(
        object.source_,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.target != null) {
      yield r'target';
      yield serializers.serialize(
        object.target,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.login != null) {
      yield r'login';
      yield serializers.serialize(
        object.login,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.password != null) {
      yield r'password';
      yield serializers.serialize(
        object.password,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqPollingImporterImplManagedPollConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.id.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'reference':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.reference.replace(valueDes);
          break;
        case r'interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.interval.replace(valueDes);
          break;
        case r'expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.expression.replace(valueDes);
          break;
        case r'source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.source_.replace(valueDes);
          break;
        case r'target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.target.replace(valueDes);
          break;
        case r'login':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.login.replace(valueDes);
          break;
        case r'password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.password.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqPollingImporterImplManagedPollConfigImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqPollingImporterImplManagedPollConfigImplPropertiesBuilder();
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

