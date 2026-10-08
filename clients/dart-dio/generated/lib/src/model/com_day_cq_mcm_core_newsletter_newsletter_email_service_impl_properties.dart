//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties.g.dart';

/// ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
///
/// Properties:
/// * [fromPeriodAddress] 
/// * [senderPeriodHost] 
/// * [maxPeriodBouncePeriodCount] 
@BuiltValue()
abstract class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties implements Built<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties, ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'from.address')
  ConfigNodePropertyString? get fromPeriodAddress;

  @BuiltValueField(wireName: r'sender.host')
  ConfigNodePropertyString? get senderPeriodHost;

  @BuiltValueField(wireName: r'max.bounce.count')
  ConfigNodePropertyString? get maxPeriodBouncePeriodCount;

  ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties._();

  factory ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties([void updates(ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder b)]) = _$ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties> get serializer => _$ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesSerializer();
}

class _$ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties, _$ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties];

  @override
  final String wireName = r'ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fromPeriodAddress != null) {
      yield r'from.address';
      yield serializers.serialize(
        object.fromPeriodAddress,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.senderPeriodHost != null) {
      yield r'sender.host';
      yield serializers.serialize(
        object.senderPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxPeriodBouncePeriodCount != null) {
      yield r'max.bounce.count';
      yield serializers.serialize(
        object.maxPeriodBouncePeriodCount,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder result,
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
        case r'sender.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.senderPeriodHost.replace(valueDes);
          break;
        case r'max.bounce.count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.maxPeriodBouncePeriodCount.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesBuilder();
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

