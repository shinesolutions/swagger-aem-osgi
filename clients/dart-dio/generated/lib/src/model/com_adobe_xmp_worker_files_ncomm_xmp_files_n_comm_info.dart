//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info.g.dart';

/// ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
/// * [bundleLocation] 
/// * [serviceLocation] 
@BuiltValue()
abstract class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo implements Built<ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo, ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties? get properties;

  @BuiltValueField(wireName: r'bundle_location')
  String? get bundleLocation;

  @BuiltValueField(wireName: r'service_location')
  String? get serviceLocation;

  ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo._();

  factory ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo([void updates(ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder b)]) = _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo> get serializer => _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoSerializer();
}

class _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoSerializer implements PrimitiveSerializer<ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo, _$ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo];

  @override
  final String wireName = r'ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties),
      );
    }
    if (object.bundleLocation != null) {
      yield r'bundle_location';
      yield serializers.serialize(
        object.bundleLocation,
        specifiedType: const FullType(String),
      );
    }
    if (object.serviceLocation != null) {
      yield r'service_location';
      yield serializers.serialize(
        object.serviceLocation,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties),
          ) as ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        case r'bundle_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bundleLocation = valueDes;
          break;
        case r'service_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.serviceLocation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBuilder();
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

