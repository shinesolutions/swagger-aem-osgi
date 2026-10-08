//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties.g.dart';

/// ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties
///
/// Properties:
/// * [inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths] 
/// * [inboxPeriodImplPeriodTypeproviderPeriodLegacypaths] 
/// * [inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem] 
/// * [inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem] 
/// * [inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask] 
@BuiltValue()
abstract class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties implements Built<ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties, ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'inbox.impl.typeprovider.registrypaths')
  ConfigNodePropertyArray? get inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths;

  @BuiltValueField(wireName: r'inbox.impl.typeprovider.legacypaths')
  ConfigNodePropertyArray? get inboxPeriodImplPeriodTypeproviderPeriodLegacypaths;

  @BuiltValueField(wireName: r'inbox.impl.typeprovider.defaulturl.failureitem')
  ConfigNodePropertyString? get inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem;

  @BuiltValueField(wireName: r'inbox.impl.typeprovider.defaulturl.workitem')
  ConfigNodePropertyString? get inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem;

  @BuiltValueField(wireName: r'inbox.impl.typeprovider.defaulturl.task')
  ConfigNodePropertyString? get inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask;

  ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties._();

  factory ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties([void updates(ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder b)]) = _$ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties> get serializer => _$ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesSerializer();
}

class _$ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties, _$ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties];

  @override
  final String wireName = r'ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths != null) {
      yield r'inbox.impl.typeprovider.registrypaths';
      yield serializers.serialize(
        object.inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.inboxPeriodImplPeriodTypeproviderPeriodLegacypaths != null) {
      yield r'inbox.impl.typeprovider.legacypaths';
      yield serializers.serialize(
        object.inboxPeriodImplPeriodTypeproviderPeriodLegacypaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem != null) {
      yield r'inbox.impl.typeprovider.defaulturl.failureitem';
      yield serializers.serialize(
        object.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem != null) {
      yield r'inbox.impl.typeprovider.defaulturl.workitem';
      yield serializers.serialize(
        object.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask != null) {
      yield r'inbox.impl.typeprovider.defaulturl.task';
      yield serializers.serialize(
        object.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'inbox.impl.typeprovider.registrypaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.inboxPeriodImplPeriodTypeproviderPeriodRegistrypaths.replace(valueDes);
          break;
        case r'inbox.impl.typeprovider.legacypaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.inboxPeriodImplPeriodTypeproviderPeriodLegacypaths.replace(valueDes);
          break;
        case r'inbox.impl.typeprovider.defaulturl.failureitem':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodFailureitem.replace(valueDes);
          break;
        case r'inbox.impl.typeprovider.defaulturl.workitem':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodWorkitem.replace(valueDes);
          break;
        case r'inbox.impl.typeprovider.defaulturl.task':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.inboxPeriodImplPeriodTypeproviderPeriodDefaulturlPeriodTask.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder();
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

