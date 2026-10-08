//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_workflow_impl_email_e_mail_notification_service_properties.g.dart';

/// ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
///
/// Properties:
/// * [fromPeriodAddress] 
/// * [hostPeriodPrefix] 
/// * [notifyPeriodOnabort] 
/// * [notifyPeriodOncomplete] 
/// * [notifyPeriodOncontainercomplete] 
/// * [notifyPeriodUseronly] 
@BuiltValue()
abstract class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties implements Built<ComDayCqWorkflowImplEmailEMailNotificationServiceProperties, ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'from.address')
  ConfigNodePropertyString? get fromPeriodAddress;

  @BuiltValueField(wireName: r'host.prefix')
  ConfigNodePropertyString? get hostPeriodPrefix;

  @BuiltValueField(wireName: r'notify.onabort')
  ConfigNodePropertyBoolean? get notifyPeriodOnabort;

  @BuiltValueField(wireName: r'notify.oncomplete')
  ConfigNodePropertyBoolean? get notifyPeriodOncomplete;

  @BuiltValueField(wireName: r'notify.oncontainercomplete')
  ConfigNodePropertyBoolean? get notifyPeriodOncontainercomplete;

  @BuiltValueField(wireName: r'notify.useronly')
  ConfigNodePropertyBoolean? get notifyPeriodUseronly;

  ComDayCqWorkflowImplEmailEMailNotificationServiceProperties._();

  factory ComDayCqWorkflowImplEmailEMailNotificationServiceProperties([void updates(ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder b)]) = _$ComDayCqWorkflowImplEmailEMailNotificationServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWorkflowImplEmailEMailNotificationServiceProperties> get serializer => _$ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesSerializer();
}

class _$ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesSerializer implements PrimitiveSerializer<ComDayCqWorkflowImplEmailEMailNotificationServiceProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWorkflowImplEmailEMailNotificationServiceProperties, _$ComDayCqWorkflowImplEmailEMailNotificationServiceProperties];

  @override
  final String wireName = r'ComDayCqWorkflowImplEmailEMailNotificationServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWorkflowImplEmailEMailNotificationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fromPeriodAddress != null) {
      yield r'from.address';
      yield serializers.serialize(
        object.fromPeriodAddress,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hostPeriodPrefix != null) {
      yield r'host.prefix';
      yield serializers.serialize(
        object.hostPeriodPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.notifyPeriodOnabort != null) {
      yield r'notify.onabort';
      yield serializers.serialize(
        object.notifyPeriodOnabort,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.notifyPeriodOncomplete != null) {
      yield r'notify.oncomplete';
      yield serializers.serialize(
        object.notifyPeriodOncomplete,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.notifyPeriodOncontainercomplete != null) {
      yield r'notify.oncontainercomplete';
      yield serializers.serialize(
        object.notifyPeriodOncontainercomplete,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.notifyPeriodUseronly != null) {
      yield r'notify.useronly';
      yield serializers.serialize(
        object.notifyPeriodUseronly,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWorkflowImplEmailEMailNotificationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'from.address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.fromPeriodAddress.replace(valueDes);
          break;
        case r'host.prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hostPeriodPrefix.replace(valueDes);
          break;
        case r'notify.onabort':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyPeriodOnabort.replace(valueDes);
          break;
        case r'notify.oncomplete':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyPeriodOncomplete.replace(valueDes);
          break;
        case r'notify.oncontainercomplete':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyPeriodOncontainercomplete.replace(valueDes);
          break;
        case r'notify.useronly':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyPeriodUseronly.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWorkflowImplEmailEMailNotificationServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder();
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

