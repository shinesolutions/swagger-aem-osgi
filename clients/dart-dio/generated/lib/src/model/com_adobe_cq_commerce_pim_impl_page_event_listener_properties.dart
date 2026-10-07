//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_commerce_pim_impl_page_event_listener_properties.g.dart';

/// ComAdobeCqCommercePimImplPageEventListenerProperties
///
/// Properties:
/// * [cqPeriodCommercePeriodPageeventlistenerPeriodEnabled] 
@BuiltValue()
abstract class ComAdobeCqCommercePimImplPageEventListenerProperties implements Built<ComAdobeCqCommercePimImplPageEventListenerProperties, ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.commerce.pageeventlistener.enabled')
  ConfigNodePropertyBoolean? get cqPeriodCommercePeriodPageeventlistenerPeriodEnabled;

  ComAdobeCqCommercePimImplPageEventListenerProperties._();

  factory ComAdobeCqCommercePimImplPageEventListenerProperties([void updates(ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder b)]) = _$ComAdobeCqCommercePimImplPageEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCommercePimImplPageEventListenerProperties> get serializer => _$ComAdobeCqCommercePimImplPageEventListenerPropertiesSerializer();
}

class _$ComAdobeCqCommercePimImplPageEventListenerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCommercePimImplPageEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCommercePimImplPageEventListenerProperties, _$ComAdobeCqCommercePimImplPageEventListenerProperties];

  @override
  final String wireName = r'ComAdobeCqCommercePimImplPageEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCommercePimImplPageEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodCommercePeriodPageeventlistenerPeriodEnabled != null) {
      yield r'cq.commerce.pageeventlistener.enabled';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodPageeventlistenerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCommercePimImplPageEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.commerce.pageeventlistener.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodPageeventlistenerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCommercePimImplPageEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder();
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

