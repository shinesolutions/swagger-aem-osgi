//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties.g.dart';

/// ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
///
/// Properties:
/// * [maxConnections] 
/// * [maxRequests] 
/// * [requestTimeout] 
/// * [logDir] 
@BuiltValue()
abstract class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties implements Built<ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties, ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder> {
  @BuiltValueField(wireName: r'maxConnections')
  ConfigNodePropertyString? get maxConnections;

  @BuiltValueField(wireName: r'maxRequests')
  ConfigNodePropertyString? get maxRequests;

  @BuiltValueField(wireName: r'requestTimeout')
  ConfigNodePropertyString? get requestTimeout;

  @BuiltValueField(wireName: r'logDir')
  ConfigNodePropertyString? get logDir;

  ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties._();

  factory ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties([void updates(ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder b)]) = _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties> get serializer => _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesSerializer();
}

class _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesSerializer implements PrimitiveSerializer<ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties, _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties];

  @override
  final String wireName = r'ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxConnections != null) {
      yield r'maxConnections';
      yield serializers.serialize(
        object.maxConnections,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxRequests != null) {
      yield r'maxRequests';
      yield serializers.serialize(
        object.maxRequests,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.requestTimeout != null) {
      yield r'requestTimeout';
      yield serializers.serialize(
        object.requestTimeout,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.logDir != null) {
      yield r'logDir';
      yield serializers.serialize(
        object.logDir,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'maxConnections':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.maxConnections.replace(valueDes);
          break;
        case r'maxRequests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.maxRequests.replace(valueDes);
          break;
        case r'requestTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.requestTimeout.replace(valueDes);
          break;
        case r'logDir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.logDir.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder();
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

